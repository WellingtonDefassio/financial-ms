package bcb.com.br.financial.service;

import bcb.com.br.financial.controller.dto.CreatProvisionCreditRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreditProvisionSendService {

    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;

    public void sendProvisionToQueue(CreatProvisionCreditRequest request) {
        String json = convertToJson(request);
        rabbitTemplate.convertAndSend(queue.getName(), json);
    }

    @SneakyThrows
    private String convertToJson(CreatProvisionCreditRequest request) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(request);
    }

}

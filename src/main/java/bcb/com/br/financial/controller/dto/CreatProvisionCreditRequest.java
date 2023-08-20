package bcb.com.br.financial.controller.dto;

import lombok.Data;

@Data
public class CreatProvisionCreditRequest {
    private String cnpj;
    private Double value;
}

package bcb.com.br.financial.controller;

import bcb.com.br.financial.controller.dto.CreatProvisionCreditRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/credit")
public class ProvisionCreditController {

    @PostMapping("/send")
    public ResponseEntity<Void> create(@RequestBody @Valid CreatProvisionCreditRequest request) {


        return ResponseEntity.ok().build();
    }


}

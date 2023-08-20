package bcb.com.br.financial.controller.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class CreatProvisionCreditRequest {
    @NotEmpty
    private String cnpj;
    @Min(1)
    private Double value;
}

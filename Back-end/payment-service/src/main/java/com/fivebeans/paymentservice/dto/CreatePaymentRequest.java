package com.fivebeans.paymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentRequest {

    private int amount;
    @NotBlank
    private String currency;
    @NotBlank
    private String paymentMethodId;

}

package com.fivebeans.paymentservice.controller;

import com.fivebeans.paymentservice.service.PaymentsService;
import com.fivebeans.paymentservice.dto.CreatePaymentRequest;
import com.fivebeans.paymentservice.dto.CreatePaymentResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@Slf4j
public class PaymentsController {

    @Autowired
    private PaymentsService paymentsService;

    @PostMapping("/pay")
    public ResponseEntity<?> doPayment(@RequestBody @Valid CreatePaymentRequest createPaymentRequest) {
        CreatePaymentResponse paymentRequest = paymentsService.createPaymentRequest(createPaymentRequest);
        return new ResponseEntity<>(paymentRequest, HttpStatus.CREATED);
    }

}

package com.fivebeans.paymentservice.service;

import com.fivebeans.paymentservice.dto.CreatePaymentRequest;
import com.fivebeans.paymentservice.dto.CreatePaymentResponse;


public interface PaymentsService {
    CreatePaymentResponse createPaymentRequest(CreatePaymentRequest createPaymentRequest);
}

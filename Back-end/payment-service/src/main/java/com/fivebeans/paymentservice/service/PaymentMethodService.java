package com.fivebeans.paymentservice.service;

import com.fivebeans.paymentservice.dto.CreatePaymentMethodRequest;
import com.fivebeans.paymentservice.dto.GetPaymentMethodResponse;

import java.util.List;


public interface PaymentMethodService {
    void createPaymentMethod(CreatePaymentMethodRequest createPaymentMethodRequest);

    List<GetPaymentMethodResponse> getAllMyPaymentMethods();

    GetPaymentMethodResponse getMyPaymentMethodById(String paymentMethodId);
}

package com.fivebeans.orderservice.service;

import com.fivebeans.orderservice.dto.CreateOrderRequest;
import com.fivebeans.orderservice.dto.CreateOrderResponse;
import com.fivebeans.orderservice.dto.PreviewOrderRequest;
import com.fivebeans.orderservice.dto.PreviewOrderResponse;

import java.util.List;


public interface OrderService {

    CreateOrderResponse createOrder(CreateOrderRequest createOrderRequest);

    PreviewOrderResponse previewOrder(PreviewOrderRequest previewOrderRequest);

    CreateOrderResponse getOrderById(String orderId);

    List<CreateOrderResponse> getMyOrders();

    List<CreateOrderResponse> getAllOrders();
}

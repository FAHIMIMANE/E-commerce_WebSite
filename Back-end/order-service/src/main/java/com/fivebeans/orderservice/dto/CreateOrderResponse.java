package com.fivebeans.orderservice.dto;

import com.fivebeans.orderservice.entity.OrderBillingAddress;
import com.fivebeans.orderservice.entity.OrderItem;
import com.fivebeans.orderservice.entity.OrderShippingAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderResponse {
    private String orderId;
    private List<OrderItem> orderItems = new ArrayList<>();
    private OrderShippingAddress shippingAddress;
    private OrderBillingAddress billingAddress;
    private Card card;
    private Double itemsTotalPrice;
    private Double taxPrice;
    private Double shippingPrice;
    private Double totalPrice;
    private boolean isPaid;
    private LocalDateTime paymentDate;
    private boolean isDelivered;
    private String paymentReceiptUrl;
    private LocalDateTime deliveredDate;
    private Instant created_at;
}

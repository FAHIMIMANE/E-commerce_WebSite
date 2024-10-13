package com.fivebeans.orderservice.dto;

import com.fivebeans.commons.dto.GetAddressResponse;
import com.fivebeans.orderservice.entity.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PreviewOrderResponse {
    private List<OrderItem> orderItems = new ArrayList<>();
    private GetAddressResponse shippingAddress;
    private GetAddressResponse billingAddress;
    private Card card;
    private Double itemsTotalPrice;
    private Double taxPrice;
    private Double shippingPrice;
    private Double totalPrice;
}

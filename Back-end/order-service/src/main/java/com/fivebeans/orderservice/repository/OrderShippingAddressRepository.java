package com.fivebeans.orderservice.repository;

import com.fivebeans.orderservice.entity.OrderShippingAddress;
import org.springframework.data.repository.CrudRepository;


public interface OrderShippingAddressRepository extends CrudRepository<OrderShippingAddress, String> {
    OrderShippingAddress findByOrderId(String orderId);
}

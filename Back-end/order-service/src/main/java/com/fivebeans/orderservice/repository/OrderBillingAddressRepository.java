package com.fivebeans.orderservice.repository;

import com.fivebeans.orderservice.entity.OrderBillingAddress;
import org.springframework.data.repository.CrudRepository;


public interface OrderBillingAddressRepository extends CrudRepository<OrderBillingAddress, String> {
    OrderBillingAddress findByOrderId(String orderId);
}

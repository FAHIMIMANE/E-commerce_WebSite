package com.fivebeans.orderservice.repository;

import com.fivebeans.orderservice.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface OrderRepository extends CrudRepository<Order, String> {

    Order findByOrderId(String orderId);

    List<Order> findByUserId(String userId);
}

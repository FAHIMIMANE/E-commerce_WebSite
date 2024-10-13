package com.fivebeans.orderservice.repository;

import com.fivebeans.orderservice.entity.OrderItem;
import org.springframework.data.repository.CrudRepository;


public interface OrderItemRepository extends CrudRepository<OrderItem, String> {
}

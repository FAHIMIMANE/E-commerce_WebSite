package com.fivebeans.paymentservice.repository;

import com.fivebeans.paymentservice.entity.UserPaymentCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserPaymentCustomerRepository extends JpaRepository<UserPaymentCustomer, String> {

    UserPaymentCustomer findByUserId(String userId);
}

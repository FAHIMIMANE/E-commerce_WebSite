package com.fivebeans.orderservice.repository;

import com.fivebeans.orderservice.entity.Cart;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Optional;


@Transactional
public interface CartRepository extends CrudRepository<Cart, String> {

    Cart findCartByUserName(String userName);

    Optional<Cart> findByCartId(String cartId);
}

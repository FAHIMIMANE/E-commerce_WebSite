package com.fivebeans.orderservice.service;

import com.fivebeans.orderservice.entity.Cart;


public interface CartService {

    Cart getCart();
    
    Cart getCartByCartId(String cartId);

    String createCart();

    Cart getCartByUserName(String userName);

}

package com.fivebeans.orderservice.service;

import com.fivebeans.orderservice.entity.CartItem;
import com.fivebeans.orderservice.dto.CartItemRequest;


public interface CartItemService {

    void addCartItem(CartItemRequest cartItemRequest);
    void removeCartItem(String cartItemId);
    CartItem getCartItem(String cartItemId);
    void removeAllCartItems(String cartId);

}

package com.revature.project1.services;

import com.revature.project1.model.Cart;
import com.revature.project1.model.Item;

import java.util.List;

public interface CartServices {
    public Cart addCart(Cart cart);
    public Cart deleteCartById(int carId);
    public Cart updateCart(Cart cart);
    public List<Cart> getCarts();


}




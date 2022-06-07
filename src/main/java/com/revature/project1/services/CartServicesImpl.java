package com.revature.project1.services;

import com.revature.project1.dao.CartDAO;
import com.revature.project1.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServicesImpl implements CartServices{
    @Autowired
    CartDAO cartDAO;
    @Override
    public Cart addCart(Cart cart) {
        return cartDAO.save(cart);
    }

    @Override
    public Cart deleteCartById(int cartId) {
        return cartDAO.deleteById(cartId);
    }

    @Override
    public Cart updateCart(Cart cart) {
        return cartDAO.save(cart);
    }

    @Override
    public List<Cart> getCarts() {
        return cartDAO.findAll();
    }
}

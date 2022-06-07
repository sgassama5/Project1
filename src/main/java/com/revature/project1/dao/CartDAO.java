package com.revature.project1.dao;

import com.revature.project1.model.Cart;
import com.revature.project1.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartDAO extends JpaRepository<Cart,Integer> {

    public Cart deleteById(int cartId);



}

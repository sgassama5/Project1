package com.revature.project1.dao;

import com.revature.project1.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartDAO extends JpaRepository<Cart,Integer> {
    public void insertToCart(int CartId, int ItemId);
    public void deleteById(int cartId);
    public List<Cart> getUserCart(int CartId);

}

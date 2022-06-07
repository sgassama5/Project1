package com.revature.project1.controller;

import com.revature.project1.model.Cart;
import com.revature.project1.model.Item;
import com.revature.project1.services.CartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Cart")
public class CartController {
    @Autowired
    CartServices cartServices;
    @PostMapping
    public Cart addCart(@RequestBody Cart cart){
        return cartServices.addCart(cart);
    }
    @PutMapping("/Cart")
    public Cart updateCart(@RequestBody Cart cart){
        return cartServices.updateCart(cart);
    }
    @DeleteMapping("{cId}")     //localhost:8085/Cart/78                        -HTTP method - DELETE
    public Cart  deleteCartByID(@PathVariable("cId") int cartId) {
        System.out.println("Deleting details  by Cart id  :" + cartId);
       return cartServices.deleteCartById(cartId);
    }
    @GetMapping("/Cart")     //localhost:8085/cart
    public List<Cart> getCarts() {
      return cartServices.getCarts();
    }


}

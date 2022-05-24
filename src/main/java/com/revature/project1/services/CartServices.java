package com.revature.project1.services;

import com.revature.project1.model.Item;

import java.util.List;

public interface CartServices {
    public void  addItemToCart(int itemId, int CartId);
    public void addItemToOrders(int OrderId);
    public arrayList<Item> getItems();
}

package com.revature.project1.services;

import com.revature.project1.model.Cart;
import com.revature.project1.model.Item;

import java.util.List;

public interface ItemServices {
    public Item addItem(Item item);
    public Cart deleteItemById(int itemId);
    public Item updateItem(Item item);
   // public Item getItem(int itemId);
    public List<Item> getItems();



}

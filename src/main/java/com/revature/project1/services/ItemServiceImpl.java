package com.revature.project1.services;

import com.revature.project1.dao.ItemDAO;
import com.revature.project1.model.Cart;
import com.revature.project1.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemServices {

    @Autowired
    ItemDAO itemDAO;

    @Override
    public Item addItem(Item item) {
        return itemDAO.save(item);

    }

    @Override
    public Cart deleteItemById(int itemId) {
         itemDAO.deleteById(itemId);
        return null;
    }

    @Override
    public Item updateItem(Item item) {
        return itemDAO.save(item);
    }
    @Override
    public List<Item> getItems() {
        return itemDAO.findAll();
    }

    //by default these are not exposed




}

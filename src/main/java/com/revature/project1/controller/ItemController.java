package com.revature.project1.controller;

import com.revature.project1.model.Cart;
import com.revature.project1.model.Item;
import com.revature.project1.services.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    ItemServices itemServices;
    @PostMapping
    public Item addItem(@RequestBody Item item){
        return itemServices.addItem(item);
    }
    @PutMapping("/item")
    public Item updateItem(@RequestBody Item item){
        return itemServices.updateItem(item);
    }
    @DeleteMapping("{pId}")     //localhost:8085/Cart/78                        -HTTP method - DELETE
    public Cart deleteItemByID(@PathVariable("pId") int itemId) {
        System.out.println("Deleting details  by Cart id  :" + itemId);
        return itemServices.deleteItemById(itemId);
    }
    @GetMapping("/item")     //localhost:8085/cart
    public List<Item> getItems() {
        return itemServices.getItems();
    }

}

package com.revature.project1.dao;

import com.revature.project1.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemDAO extends JpaRepository<Item,Integer> {
    public List<Item> getAllItems();
}

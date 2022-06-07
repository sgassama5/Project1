package com.revature.project1.model;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.io.Serializable;



@Data
@AllArgsConstructor
//@Component
@Entity
@Table(name = "Item",schema = "project1")
@NoArgsConstructor
public class Item implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, updatable = false)
    private int itemId;
    private String name;
    private double price;
    @ManyToOne
    private Cart cart;
    public String displayMessage(){
        return "This message is coming from product class";
    }
}

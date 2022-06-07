package com.revature.project1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "Cart",schema = "project1")

public class Cart implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;

    @OneToOne(mappedBy = "cart")
    private User user;
    @OneToMany(mappedBy = "cart")
    private List<Item> item;





}

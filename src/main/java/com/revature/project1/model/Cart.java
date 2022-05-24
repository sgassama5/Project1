package com.revature.project1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "Cart",schema = "projectone")

public class Cart implements Serializable{
    @Id
    private int cartId;
    private int userId;
    private int ItemId;

    @Column(name = "CartId")
    private Cart cart;




}

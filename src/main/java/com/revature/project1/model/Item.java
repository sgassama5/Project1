package com.revature.project1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "Item",schema = "projectone")
public class Item implements Serializable{
    @Id
    private int ItemId;
    private int itemName;
    private double itemPrice;
}

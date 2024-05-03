package com.invetoryManagement.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;

import java.util.Date;

@Entity
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    int idProduct;

    @Getter @Setter
    String name;

    @Getter @Setter
    int category;

    @Getter @Setter
    String description;

    @Getter @Setter
    int stock;

    @Getter @Setter
    float price;

    @Getter @Setter
    int supplierId;

    @Getter @Setter
    Date dateEntry;

    @Getter @Setter
    int state;

    @Getter @Setter
    String comments;

    @Getter @Setter
    String attributes;

    public Product(){}

    public Product(String name, int category, String description, int stock, float price, int supplierId, Date dateEntry, int state, String comments, String attributes) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.supplierId = supplierId;
        this.dateEntry = dateEntry;
        this.state = state;
        this.comments = comments;
        this.attributes = attributes;
    }
}

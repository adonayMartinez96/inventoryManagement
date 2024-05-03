package com.invetoryManagement.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;



@Entity
@AllArgsConstructor
public class CategoryProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    int idCategory;

    @Getter @Setter
    String name;

    @Getter @Setter
    int state;

    public CategoryProduct(){}

    public CategoryProduct(String name, int state){
        this.name = name;
        this.state = state;
    }
}

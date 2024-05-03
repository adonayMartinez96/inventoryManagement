package com.invetoryManagement.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class ProductDTO {

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
}

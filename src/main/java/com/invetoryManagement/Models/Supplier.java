package com.invetoryManagement.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@AllArgsConstructor
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    int idSupplier;

    @Getter @Setter
    String name;

    @Getter @Setter
    String email;

    @Getter @Setter
    String address;

    @Getter @Setter
    String city;

    @Getter @Setter
    String country;

    @Getter @Setter
    String productSupplier;

    public Supplier(String name, String email, String address, String city, String country, String productSupplier) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
        this.country = country;
        this.productSupplier = productSupplier;
    }
}

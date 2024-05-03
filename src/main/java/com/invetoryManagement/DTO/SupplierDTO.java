package com.invetoryManagement.DTO;

import lombok.Getter;
import lombok.Setter;

public class SupplierDTO {
    @Getter
    @Setter
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
}

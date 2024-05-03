package com.invetoryManagement.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    int idRol;

    @Getter @Setter
    String nameRol;

    @Getter @Setter
    String descriptionRol;

    @Getter @Setter
    String licenses; //this field have a one list with all permissions

    @Getter @Setter
    String associetedUsers; // este campo mostrar un array con todos los users que poseen este rol

    @Getter @Setter
    int enabled; //this field gives us inrormation about this role is 1= active o 0=inactive

    public Rol() {

    }

    public Rol(String nameRol, String descriptionRol, String licenses, String associetedUsers, int enabled) {
        this.nameRol = nameRol;
        this.descriptionRol = descriptionRol;
        this.licenses = licenses;
        this.associetedUsers = associetedUsers;
        this.enabled = enabled;
    }
}

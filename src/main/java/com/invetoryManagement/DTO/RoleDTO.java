package com.invetoryManagement.DTO;

import lombok.Getter;
import lombok.Setter;

public class RoleDTO {
    @Getter
    @Setter
    String nameRol;

    @Getter @Setter
    String descriptionRol;

    @Getter @Setter
    String licenses; //this field have a one list with all permissions

    @Getter @Setter
    String associetedUsers; // este campo mostrar un array con todos los users que poseen este rol

    @Getter @Setter
    int enabled;
}

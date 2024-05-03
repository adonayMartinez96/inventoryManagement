package com.invetoryManagement.Services.Interfaces;

import com.invetoryManagement.DTO.RoleDTO;
import com.invetoryManagement.Models.Rol;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IRoleService {
    List<Rol> getAllRoles();
    ResponseEntity<?> deleteRol(int id);
    ResponseEntity<?> updateRol(int id, RoleDTO role);
    void saveRole(RoleDTO role);
}

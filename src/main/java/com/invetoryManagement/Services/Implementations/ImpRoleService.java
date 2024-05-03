package com.invetoryManagement.Services.Implementations;

import com.invetoryManagement.DTO.RoleDTO;
import com.invetoryManagement.Models.Rol;
import com.invetoryManagement.Repository.RoleRepository;
import com.invetoryManagement.Services.Interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpRoleService implements IRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Rol> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public ResponseEntity<?> deleteRol(int id) {
        Optional<?> exist = roleRepository.findById(id);
        if(exist.isPresent()) {
            roleRepository.deleteById(id);
            return new ResponseEntity<>("Rol eliminado con exito", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("El id no fue encontrado",HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<?> updateRol(int id, RoleDTO role  ) {
        Optional exist =  roleRepository.findById(id);

        if(exist.isPresent()){
            Rol rol = (Rol) exist.get();

            //extraer valores del dto y asignarlo a  ROL
            rol.setNameRol(role.getNameRol());
            rol.setDescriptionRol(role.getDescriptionRol());
            rol.setLicenses(role.getLicenses());
            rol.setAssocietedUsers(role.getAssocietedUsers());
            rol.setEnabled(role.getEnabled());

            roleRepository.save(rol);
            return new ResponseEntity<>("El rol fue actualizado con exito", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("El rol no fue pudo guardado",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public void saveRole(RoleDTO role) {
        Rol rol = new Rol();

        //extraer valores del dto y asignarlo a  ROL
        rol.setNameRol(role.getNameRol());
        rol.setDescriptionRol(role.getDescriptionRol());
        rol.setLicenses(role.getLicenses());
        rol.setAssocietedUsers(role.getAssocietedUsers());
        rol.setEnabled(role.getEnabled());

        roleRepository.save(rol);
    }
}

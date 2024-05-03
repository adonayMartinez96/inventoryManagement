package com.invetoryManagement.Controllers;

import com.invetoryManagement.DTO.RoleDTO;
import com.invetoryManagement.Models.Rol;
import com.invetoryManagement.Services.Implementations.ImpRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@RestController
public class RolController {

    @Autowired
    private ImpRoleService impRoleService;

    @RequestMapping(value = "/getRol",method = RequestMethod.GET)
    public List<Rol> getAllRol(){
        return impRoleService.getAllRoles();
    }

    @RequestMapping(value ="/updateRol/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> deleteRol(@PathVariable int id, @RequestBody RoleDTO roleDTO){
        return impRoleService.updateRol(id,roleDTO);
    }

    @RequestMapping(value = "/saveRol",method = RequestMethod.POST)
    public void saveRol(@RequestBody RoleDTO role) {
        impRoleService.saveRole(role);
    }

    @RequestMapping(value="/deleteRol/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteRol(@PathVariable int id){
        return impRoleService.deleteRol(id);
    }
}

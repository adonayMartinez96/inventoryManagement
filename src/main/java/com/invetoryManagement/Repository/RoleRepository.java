package com.invetoryManagement.Repository;

import com.invetoryManagement.Models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface RoleRepository extends JpaRepository<Rol,Integer> {

}

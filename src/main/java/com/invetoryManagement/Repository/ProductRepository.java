package com.invetoryManagement.Repository;

import com.invetoryManagement.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {
   // Optional<Product> findById(Integer integer);

    Optional<Product> findByIdProduct(Integer integer);
}

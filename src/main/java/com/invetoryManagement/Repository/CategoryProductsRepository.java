package com.invetoryManagement.Repository;

import com.invetoryManagement.Models.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryProductsRepository extends JpaRepository<CategoryProduct, Integer> {

}

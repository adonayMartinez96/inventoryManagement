package com.invetoryManagement.Services.Interfaces;

import com.invetoryManagement.DTO.CategoryProductDTO;
import com.invetoryManagement.Models.CategoryProduct;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICategoryProductsService {
    void saveCategory(CategoryProductDTO categoryProductDTO);
    ResponseEntity<?> updateCategory(int id, CategoryProductDTO categoryProductDTO);
    List<CategoryProduct> getAllCategory();
    void deleteCategory(int id);
    ResponseEntity<?> getCategory(int id);
}

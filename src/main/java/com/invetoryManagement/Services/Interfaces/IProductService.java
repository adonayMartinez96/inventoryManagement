package com.invetoryManagement.Services.Interfaces;

import com.invetoryManagement.DTO.ProductDTO;
import com.invetoryManagement.Models.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IProductService {
   void saveProduct (ProductDTO productDTO);
   ResponseEntity<Product> updateProduct(int id, ProductDTO productDTO);
   List<Product> getAllProducts();
   ResponseEntity<?> deleteProduct(int id);
   ResponseEntity<?> getProduct(int id);
}

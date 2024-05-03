package com.invetoryManagement.Services.Implementations;

import com.invetoryManagement.DTO.CategoryProductDTO;
import com.invetoryManagement.Models.CategoryProduct;
import com.invetoryManagement.Repository.CategoryProductsRepository;
import com.invetoryManagement.Services.Interfaces.ICategoryProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ImpCategoryProductService implements ICategoryProductsService {

    @Autowired
    private CategoryProductsRepository categoryRepository;

    @Override
    public void saveCategory(CategoryProductDTO categoryProductDTO) {
        CategoryProduct categoryNew = new CategoryProduct();

        categoryNew.setName(categoryProductDTO.getName());
        categoryNew.setState(categoryProductDTO.getState());

        categoryRepository.save(categoryNew);
    }

    @Override
    public ResponseEntity<?> updateCategory(int id, CategoryProductDTO categoryProductDTO) {
        Optional<CategoryProduct> exist= categoryRepository.findById(id);

        if(exist.isPresent()){
            CategoryProduct  category= exist.get();

            category.setName(categoryProductDTO.getName());
            category.setState(categoryProductDTO.getState());

            return  new ResponseEntity<>(categoryRepository.save(category), HttpStatus.OK);
        }else{
            System.out.printf("el producto con el id: "+id+" no existe");
        }
        return null;
    }

    @Override
    public List<CategoryProduct> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public void deleteCategory(int id) {
        Optional exist = categoryRepository.findById(id);

        if(exist.isPresent()){
            categoryRepository.deleteById(id);
        }else {
            System.out.println("esta categoria no existe");
        }
    }

    @Override
    public ResponseEntity<?> getCategory(int id) {
        Optional<CategoryProduct> exist = categoryRepository.findById(id);

        if(exist.isPresent()){
            return new ResponseEntity<>(exist.get(),HttpStatus.OK);
        }{
            return new ResponseEntity<>("La categoria no existe",HttpStatus.BAD_REQUEST);
        }

    }
}

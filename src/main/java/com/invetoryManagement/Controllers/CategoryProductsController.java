package com.invetoryManagement.Controllers;

import com.invetoryManagement.DTO.CategoryProductDTO;
import com.invetoryManagement.Models.CategoryProduct;
import com.invetoryManagement.Services.Implementations.ImpCategoryProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryProductsController {

    @Autowired
    private ImpCategoryProductService categoryProductService;

    @RequestMapping(value = "/getCategory", method = RequestMethod.GET)
    public List<CategoryProduct> getCategory(){
        return  categoryProductService.getAllCategory();
    }

    @RequestMapping(value="/saveCategory", method = RequestMethod.POST)
    public ResponseEntity<?> saveCategory(@RequestBody CategoryProductDTO categoryProductDTO){
        categoryProductService.saveCategory(categoryProductDTO);
        return new ResponseEntity<>("Categoria guardada con exito", HttpStatus.OK);
    }

    @RequestMapping(value = "/updateCategory/{id}", method =  RequestMethod.PUT)
    public  ResponseEntity<?> update(@PathVariable int id, @RequestBody CategoryProductDTO categoryProductDTO){
        categoryProductService.updateCategory(id,categoryProductDTO);
        return new ResponseEntity<>("Categoria actualizada", HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteCategory/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCategory(@PathVariable int id){
        categoryProductService.deleteCategory(id);
        return new ResponseEntity<>("Categoria eliminada con exito",HttpStatus.OK);
    }
}

package com.invetoryManagement.Controllers;

import com.invetoryManagement.DTO.ProductDTO;
import com.invetoryManagement.Models.Product;
import com.invetoryManagement.Services.Implementations.ImpProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ImpProductService productService;

    @RequestMapping(value = "/getProducts", method = RequestMethod.GET)
    public List<Product> getProduct(){
        return productService.getAllProducts();
    }

    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public ResponseEntity<?> saveProduct(@RequestBody ProductDTO productDTO){
        productService.saveProduct(productDTO);
        return new ResponseEntity<>("Usuario guardado exitosamente", HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> saveProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

        @RequestMapping(value = "/updateProduct/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody ProductDTO productDTO){
        return productService.updateProduct(id,productDTO);
    }

    @RequestMapping(value= "/getProduct/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }
}

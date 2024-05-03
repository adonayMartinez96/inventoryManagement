package com.invetoryManagement.Services.Implementations;

import com.invetoryManagement.DTO.ProductDTO;
import com.invetoryManagement.Models.Product;
import com.invetoryManagement.Repository.ProductRepository;
import com.invetoryManagement.Services.Interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ImpProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void saveProduct(ProductDTO productDTO) {

        Product product = new Product();

        product.setName(productDTO.getName());
        product.setCategory(productDTO.getCategory());
        product.setDescription(productDTO.getDescription());
        product.setStock(productDTO.getStock());
        product.setPrice(productDTO.getPrice());
        product.setSupplierId(productDTO.getSupplierId());
        product.setDateEntry(productDTO.getDateEntry());
        product.setState(productDTO.getState());
        product.setComments(productDTO.getComments());
        product.setAttributes(productDTO.getAttributes());

        productRepository.save(product);
    }

    @Override
    public ResponseEntity<Product> updateProduct(int id, ProductDTO productDTO) {
        Optional<Product> exist = productRepository.findById(id);


        if(exist.isPresent()){

            Product findProduct = exist.get();

            System.out.println("el producto con id "+findProduct.getIdProduct()+" esta presente");

            findProduct.setName(productDTO.getName());
            findProduct.setCategory(productDTO.getCategory());
            findProduct.setDescription(productDTO.getDescription());
            findProduct.setStock(productDTO.getStock());
            findProduct.setPrice(productDTO.getPrice());
            findProduct.setSupplierId(productDTO.getSupplierId());
            findProduct.setDateEntry(productDTO.getDateEntry());
            findProduct.setState(productDTO.getState());
            findProduct.setComments(productDTO.getComments());
            findProduct.setAttributes(productDTO.getAttributes());

            return new ResponseEntity<>(productRepository.save(findProduct), HttpStatus.OK);
        }else{
            System.out.println("el producto con id "+id+" no esta presente");

            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ResponseEntity<?> deleteProduct(int id) {
        Optional<Product> exist = productRepository.findById(id);

        if(exist.isPresent()){
            productRepository.deleteById(id);
            return new ResponseEntity<>("Producto con id: "+id +" eliminado", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No se encontro el carro con id: "+ id,HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> getProduct(int id) {
        Optional<Product> exist = productRepository.findById(id);

        if(exist.isPresent()){
            return new ResponseEntity<>(productRepository.save(exist.get()), HttpStatus.OK);
        }else{
            return new ResponseEntity<>("El producto no existe", HttpStatus.OK);
        }

    }

}

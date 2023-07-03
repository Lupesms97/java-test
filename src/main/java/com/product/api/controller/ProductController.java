package com.product.api.controller;

import com.product.api.model.Product;
import com.product.api.repository.ProductRepository;
import com.product.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService ProductService;

    @PostMapping ("/creat")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Product> createProduct(Product product){
        Product savedProduct = ProductService.saveProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

}

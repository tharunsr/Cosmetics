package com.cosmetics.controller;

import com.cosmetics.entities.Product;
import com.cosmetics.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmetics")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/")
    public String display(){
        return "Welcome to Cosmetics";
    }

    @GetMapping("/products")
    public List<Product> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void update(@RequestBody Product prod){
        service.update(prod);
    }

    @DeleteMapping("/products/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteById(id);
    }



}

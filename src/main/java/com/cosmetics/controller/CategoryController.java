package com.cosmetics.controller;

import com.cosmetics.entities.Category;
import com.cosmetics.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmetics/category")
public class CategoryController {

    @Autowired
    CategoryService service;

    @GetMapping("/")
    public String display(){
        return "Welcome to Cosmetics";
    }

    @GetMapping("/products")
    public List<Category> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/products/{id}")
    public Category getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Category prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void update(@RequestBody Category prod){
        service.update(prod);
    }

    @DeleteMapping("/products/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteById(id);
    }


}

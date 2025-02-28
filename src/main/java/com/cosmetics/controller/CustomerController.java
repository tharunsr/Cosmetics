package com.cosmetics.controller;

import com.cosmetics.entities.Customer;
import com.cosmetics.service.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmetics/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping(" ")
    public String display(HttpServletRequest req){
        return "Welcome to Customers section " + req.getSession().getId();
    }

    @GetMapping("/customers")
    public List<Customer> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/customers/{id}")
    public Customer getProductById(@PathVariable int id){
        return service.getCustomerById(id);
    }

    @PostMapping("/customers")
    public void addProduct(@RequestBody Customer prod){
        service.addCustomer(prod);
    }

    @PutMapping("/customers")
    public void update(@RequestBody Customer prod){
        service.update(prod);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteById(id);
    }



}

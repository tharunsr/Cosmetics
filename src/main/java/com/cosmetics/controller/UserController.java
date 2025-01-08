package com.cosmetics.controller;

import com.cosmetics.entities.User;
import com.cosmetics.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmetics/user")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/")
    public String display(){
        return "Welcome to Users Section";
    }

    @GetMapping("/users")
    public List<User> getAll(){
        return service.getAll() ;
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id){
        return service.getUserById(id);
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User us){
        service.addUser(us);
    }

    @PutMapping("/users")
    public void update(@RequestBody User us){
        service.update(us);
    }

    @DeleteMapping("/users/{id}")
    public void deleteByUserId(@PathVariable int id){
        service.deleteByUserId(id);
    }
}

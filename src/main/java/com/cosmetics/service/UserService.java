package com.cosmetics.service;


import com.cosmetics.entities.User;
import com.cosmetics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public List<User> getAll() {
        return repo.findAll();
    }

    public User getUserById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void addUser(User prod) {
        repo.save(prod);
    }

    public void update(User prod) {
        repo.save(prod);
    }

    public void deleteByUserId(int id) {
        repo.deleteById(id);
    }
}

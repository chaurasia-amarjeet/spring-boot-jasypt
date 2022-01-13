package com.deeplearning.demo.controller;

import com.deeplearning.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users/{id}")
    public String getUsers(@PathVariable Long id){

        return userRepository.findById(id).get().getName();
    }
}
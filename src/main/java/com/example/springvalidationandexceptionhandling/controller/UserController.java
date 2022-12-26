package com.example.springvalidationandexceptionhandling.controller;


import com.example.springvalidationandexceptionhandling.dto.UserRequest;
import com.example.springvalidationandexceptionhandling.entity.User;
import com.example.springvalidationandexceptionhandling.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAllUsersFromDb(){

      return   userService.getAllUserFromDB();
    }


    @GetMapping("/User/{id}")
    public User findUserById(@PathVariable int id){

        return   userService.getUserbyID(id);
    }


    @PostMapping("/insert")
    public User insertUser(@RequestBody @Valid UserRequest userRequest){

        return   userService.insertUser(userRequest);
    }
}

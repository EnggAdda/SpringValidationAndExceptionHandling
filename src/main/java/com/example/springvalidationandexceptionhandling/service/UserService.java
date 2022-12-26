package com.example.springvalidationandexceptionhandling.service;


import com.example.springvalidationandexceptionhandling.dto.UserRequest;
import com.example.springvalidationandexceptionhandling.entity.User;
import com.example.springvalidationandexceptionhandling.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

     @Autowired
    private UserRepo userRepo;

     public User getUserbyID(int id ){
       return   userRepo.findById(id ).get();
     }


    public List<User> getAllUserFromDB( ){
        return   userRepo.findAll();
    }


    public User insertUser( UserRequest userRequest){
       User user =User.build(0,userRequest.getName(), userRequest.getAddress(), userRequest.getEmail(), userRequest.getAge(), userRequest.getSalary());
    return userRepo.save(user);

    }
}

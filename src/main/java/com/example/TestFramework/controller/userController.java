package com.example.TestFramework.controller;


import com.example.TestFramework.dto.request.userReuqest.createUserRequest;
import com.example.TestFramework.dto.response.apiResponse;
import com.example.TestFramework.respository.userRespository;
import com.example.TestFramework.service.userService.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.TestFramework.entity.Users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController

public class userController {
    @Autowired
    userService userService = new userService();
    @GetMapping("/getuser")
    public apiResponse getAllUser(){
        apiResponse response = new apiResponse();
        response.setCode(400);
        response.setMessage("Get All user Successfully");
        List<Users> users = userService.getAllUser();
        response.setData(users);
        return response;
    }
    @PostMapping("/createuser")
    public apiResponse createUser(@RequestBody @Validated createUserRequest user){
        apiResponse response = new apiResponse();
        response.setCode(400);
        response.setMessage("Create User Successfully");
        Users newUser = userService.addUser(user);
        response.setData(newUser);
        return response;
    }
    @DeleteMapping("/delete/{id}")
    public apiResponse deleteUser(@PathVariable String id){
        apiResponse response = new apiResponse();
        response.setCode(400);
        response.setMessage("Delete User Successfully");
        Users userDeleted =  userService.deleteUser(id);
        response.setData(userDeleted);
        return response;
    }
}

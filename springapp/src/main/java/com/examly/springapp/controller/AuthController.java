package com.examly.springapp.controller;


import com.examly.springapp.model.User;
import com.examly.springapp.model.Admin;
import com.examly.springapp.model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.service.AuthService;
import java.util.List;


@RestController
public class AuthController {
    
    @Autowired
    AuthService service;

    @PostMapping("/user/signup")
    public User saveUser(@RequestBody User user){
        return service.createUser(user);
    }

    @PostMapping("/admin/signup")
    public Admin saveAdmin(@RequestBody Admin admin){
        return service.createAdmin(admin);
    }

    @PostMapping("/user/login")
    public Boolean isUserPresent(@RequestBody Login login) throws Exception{
        return service.isUserPresent(login);
    }

    @PostMapping("/admin/login")
    public Boolean isAdminPresent(@RequestBody Login login) throws Exception{
        return service.isAdminPresent(login);
    }

}

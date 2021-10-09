package com.examly.springapp.controller;


import com.examly.springapp.model.User;
import com.examly.springapp.model.Admin;
import com.examly.springapp.model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.service.AdminService;
import java.util.List;


@RestController
public class AdminController {
    
    @Autowired
    AdminService adminService;

    @PostMapping("/admin/editProfile")
    public Admin editAdmin(@RequestBody Admin admin){
        return adminService.editAdmin(admin);
    }

    @GetMapping("/admin/editProfile")
    public Admin editAdmin(@RequestParam("id") int id){
        return adminService.getProfileById(id);
    }

    @PostMapping("/admin/profile")
    public Admin getProfile(@RequestParam("email") String email){
        return adminService.getProfile(email);
    }

}

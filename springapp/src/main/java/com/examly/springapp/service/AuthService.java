package com.examly.springapp.service; 

import org.springframework.stereotype.Service;

import com.examly.springapp.model.Admin;
import com.examly.springapp.model.Login;

import com.examly.springapp.model.User;
import com.examly.springapp.repository.UserRepository;
import com.examly.springapp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public Admin createAdmin(Admin admin){
        return adminRepository.save(admin);
    }

    public Boolean isUserPresent(Login login) throws Exception{
        User user = userRepository.findByEmail(login.getEmail());
        if(user == null) throw new Exception("User Not Found");
        if(user.getPassword().equals(login.getPassword())) return true;
        return false;
    }

    public Boolean isAdminPresent(Login login) throws Exception{
        Admin admin = adminRepository.findByEmail(login.getEmail());
        if(admin == null) throw new Exception("User Not Found");
        if(admin.getPassword().equals(login.getPassword())) return true;
        return false;
    }

}

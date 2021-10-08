package com.examly.springapp.repository;

import com.examly.springapp.model.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Integer> {


    Admin findByEmail(String email);

}
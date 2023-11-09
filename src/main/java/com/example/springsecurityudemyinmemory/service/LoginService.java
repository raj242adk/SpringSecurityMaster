package com.example.springsecurityudemyinmemory.service;

import com.example.springsecurityudemyinmemory.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private CustomerRepo customerRepo;

}

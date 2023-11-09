package com.example.springsecurityudemyinmemory.controller;

import com.example.springsecurityudemyinmemory.entity.Customer;
import com.example.springsecurityudemyinmemory.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    CustomerRepo customerRepo;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer){
        Customer saveCustomer=null;
        ResponseEntity response= null;
        try {
            saveCustomer=customerRepo.save(customer);
            if (saveCustomer.getId()>0){
                response=ResponseEntity.status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }
        }catch (Exception e){
            response=ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occored due to"+e.getMessage());
        }
        return response;
    }
}

package com.example.springsecurityudemy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccout")
    public String myAccount(){
        return "This is my account";
    }
}

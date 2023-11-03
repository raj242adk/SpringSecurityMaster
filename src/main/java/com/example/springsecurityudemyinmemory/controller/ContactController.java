package com.example.springsecurityudemyinmemory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contact")
    public String Contact(){
        return "This is contact controller";
    }
}

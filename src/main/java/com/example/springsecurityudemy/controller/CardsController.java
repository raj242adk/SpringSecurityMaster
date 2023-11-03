package com.example.springsecurityudemy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping("myCards")
    public String Cards(){
        return "This is my Card details";
    }
}

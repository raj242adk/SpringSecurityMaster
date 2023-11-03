package com.example.springsecurityudemy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NoticesController {
    @GetMapping("/notices")
    public String notices(){
        return "This is the notice";
    }
}

package com.example.springsecurityudemyinmemory.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public String Balance(){
        return "This is my Balance";
    }
}

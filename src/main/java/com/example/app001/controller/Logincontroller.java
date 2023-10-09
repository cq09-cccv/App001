package com.example.app001.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class Logincontroller {

    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}

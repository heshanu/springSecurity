package com.example.security.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableWebSecurity
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}

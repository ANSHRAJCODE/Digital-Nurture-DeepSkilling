package com.cognizant.controller;

import com.cognizant.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    HelloService service;

    @GetMapping("/hello")
    public String hello() {

        return service.getMessage();
    }
}
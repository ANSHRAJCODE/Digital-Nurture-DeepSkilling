package com.cognizant.controller;

import com.cognizant.model.AuthenticationResponse;
import com.cognizant.model.User;
import com.cognizant.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(@RequestBody User user) {

        String token = jwtService.generateToken(user.getUsername());

        return new AuthenticationResponse(token);
    }
}
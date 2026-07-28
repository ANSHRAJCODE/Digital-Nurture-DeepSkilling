package com.cognizant.service;

import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public String generateToken(String username) {
        return "JWT_TOKEN_" + username;
    }
}
package com.cognizant.controller;

import com.cognizant.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account")
    public Account getAccount() {

        return new Account(
                1001,
                "Ansh Raj",
                25000.0
        );

    }
}
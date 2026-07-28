package com.cognizant.controller;

import com.cognizant.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan")
    public Loan getLoan() {

        return new Loan(
                5001,
                "Ansh Raj",
                500000.0
        );

    }
}
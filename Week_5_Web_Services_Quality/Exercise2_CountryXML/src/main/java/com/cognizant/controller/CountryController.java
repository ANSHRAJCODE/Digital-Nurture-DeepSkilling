package com.cognizant.controller;

import com.cognizant.model.Country;
import com.cognizant.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    CountryService service;

    @GetMapping("/country")
    public Country getCountry() {
        return service.getCountry();
    }
}
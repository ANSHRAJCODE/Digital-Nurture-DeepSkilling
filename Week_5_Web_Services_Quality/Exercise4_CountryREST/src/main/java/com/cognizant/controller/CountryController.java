package com.cognizant.controller;

import com.cognizant.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")

    public Country getCountry() {

        Country country = new Country();

        country.setCode("IN");
        country.setName("India");

        return country;
    }

}
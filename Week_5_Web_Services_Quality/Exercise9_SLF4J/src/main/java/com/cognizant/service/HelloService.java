package com.cognizant.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloService.class);

    public String getMessage() {

        LOGGER.info("Inside HelloService");

        return "Hello from SLF4J";
    }
}
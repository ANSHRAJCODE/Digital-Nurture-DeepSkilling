package com.cognizant;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    ExternalApi api;

    @InjectMocks
    UserService service;

    @Test
    void testFetchData() {

        when(api.getData()).thenReturn("Mock Data");

        assertEquals("Mock Data", service.fetchData());
    }
}63WA
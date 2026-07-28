package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(4, 6));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(8, 6));
    }

    @Test
    void testMultiply() {
        assertEquals(24, calculator.multiply(4, 6));
    }

    @Test
    void testDivide() {
        assertEquals(5, calculator.divide(10, 2));
    }
}
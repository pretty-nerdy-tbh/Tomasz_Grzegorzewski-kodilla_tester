package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquared(){
        Calculator calculator = new Calculator();
        double c = 6;
        double squaredResult = calculator.squared(c);
        double squaredNegativeNumberResult = calculator.squared(-c);
        assertEquals(36, squaredResult, 0.0001);
        assertEquals(36, squaredNegativeNumberResult, 0.0001);
    }
}

package com.ordestiny.tdd.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    int testInteger1 = 50;
    int testInteger2 = 10;

    @Test
    void testAdd() {
        assertEquals(testInteger1 + testInteger2, calculator.add(testInteger1, testInteger2));
    }

    @Test
    void testMinus() {
        assertEquals(testInteger1 - testInteger2, calculator.minus(testInteger1, testInteger2));
    }

    @Test
    void testDivide() {
        assertEquals(testInteger1 / testInteger2, calculator.divide(testInteger1, testInteger2));
    }

    @Test
    void testMultiply() {
        assertEquals(testInteger1 * testInteger2, calculator.multiply(testInteger1, testInteger2));
    }

    @Test
    void testDivideInvalid() {
        Assertions.assertThatThrownBy(() -> {
            // Use the method calculator to divide here
            calculator.divide(10,0);
        }).isInstanceOf(ArithmeticException.class);;
    }
}

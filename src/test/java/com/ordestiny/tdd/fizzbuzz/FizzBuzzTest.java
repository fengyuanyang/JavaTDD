package com.ordestiny.tdd.fizzbuzz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void fizzBuzzIsCorrectlyPrinted() {
        fizzBuzz.printFizzBuzz(15);
        assertEquals("1\r\n" +
                "2\r\n" +
                "Fizz\r\n" +
                "4\r\n" +
                "Buzz\r\n" +
                "Fizz\r\n" +
                "7\r\n" +
                "8\r\n" +
                "Fizz\r\n" +
                "Buzz\r\n" +
                "11\r\n" +
                "Fizz\r\n" +
                "13\r\n" +
                "14\r\n" +
                "FizzBuzz", outputStreamCaptor.toString().trim());
    }

    @Test
    public void multiplesOfThreeButNotFiveAreFizz() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && !(i % 5 == 0)) {
                assertEquals("Fizz", fizzBuzz.fizzBuzz(i));
            }
        }
    }

    @Test
    public void multiplesOfFiveButNotThreeAreBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (!(i % 3 == 0) && (i % 5 == 0)) {
                assertEquals("Buzz", fizzBuzz.fizzBuzz(i));
            }
        }
    }

    @Test
    public void multiplesOfThreeAndFiveAreFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(i));
            }
        }
    }
}
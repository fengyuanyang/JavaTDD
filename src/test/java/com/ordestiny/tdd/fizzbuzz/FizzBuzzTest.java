package com.ordestiny.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

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
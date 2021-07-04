package com.ordestiny.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

  FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void printFizzBuzz_given15Iterations_fizzBuzzIsCorrectlyPrinted() {
    fizzBuzz.printFizzBuzz(100);
  }

  @Test
  public void fizzBuzz_givenMultipleOfThree_fizzReturned() {
    assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
  }

  @Test
  public void fizzBuzz_givenMultipleOfFive_buzzReturned() {
    assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
  }

  @Test
  public void fizzBuzz_givenMultipleOfThreeAndFive_fizzBuzzReturned() {
    assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
  }
}
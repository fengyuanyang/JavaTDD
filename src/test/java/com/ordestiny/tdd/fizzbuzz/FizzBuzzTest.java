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
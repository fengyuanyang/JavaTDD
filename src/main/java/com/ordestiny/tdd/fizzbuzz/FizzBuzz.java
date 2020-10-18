package com.ordestiny.tdd.fizzbuzz;

public class FizzBuzz {

    public void printFizzBuzz(int numberIteration) {
        for (int i = 1; i <= numberIteration; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public String fizzBuzz(int i) {
        boolean isFizz = i % 3 == 0;
        boolean isBuzz = i % 5 == 0;
        boolean isFizzBuzz = isFizz && isBuzz;

        if (isFizzBuzz) {
            return "FizzBuzz";
        } else if (isFizz) {
            return "Fizz";
        } else if (isBuzz) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}

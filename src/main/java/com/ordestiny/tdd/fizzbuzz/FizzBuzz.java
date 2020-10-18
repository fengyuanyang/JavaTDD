package com.ordestiny.tdd.fizzbuzz;

public class FizzBuzz {

    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
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

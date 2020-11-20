package com.ordestiny.tdd.algorithms;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * The length of the array is n-1. So the sum of all n elements,
 * i.e sum of numbers from 1 to n can be calculated using the formula n*(n+1)/2.
 * Now find the sum of all the elements in the array and subtract it from the sum of first n natural numbers,
 * it will be the value of the missing element.
 */
public class FindMissing {
    public int missingNumber(int[] missingNumbers) {
        assert missingNumbers != null;
        int length = missingNumbers.length + 1;
        int expectCorrectSum = (length * (length + 1)) / 2;
        int missingNumbersSum = Arrays.stream(missingNumbers).sum();

        int missingNumber = expectCorrectSum - missingNumbersSum;
        return missingNumber;
    }
}

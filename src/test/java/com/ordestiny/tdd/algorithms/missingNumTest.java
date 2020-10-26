package com.ordestiny.tdd.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class missingNumTest {
    private final int[] searchArray1 = {1, 2,  4, 5, 6, 7};
    private final int[] searchArray2 = {1, 2, 3, 4, 5,  7, 8};
    private final int[] notSortedArray = {1, 2, 3, 8, 6, 7, 4};


    @Test
    public void binarySearch_IntegerArray_NumberOfSteps() {
        assertEquals(3, SearchingAlgorithms.missingNum(searchArray1));
        assertEquals(6, SearchingAlgorithms.missingNum(searchArray2));
        assertEquals(5, SearchingAlgorithms.missingNum(notSortedArray));
    }


}

package com.ordestiny.tdd.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    private final int[] searchArray1 = {1, 2, 3, 4, 5, 6, 7};
    private final int[] searchArray2 = {1, 2, 3, 4, 5, 6, 7, 8};
    private final int[] notSortedArray = {1, 2, 3, 8, 5, 6, 7, 4};
    private final int[] shortArray = {1, 2};
    private final int[] emptyArray = {};

    @Test
    public void binarySearch_IntegerArray_NumberOfSteps() {
        assertEquals(3, SearchingAlgorithms.binarySearch(searchArray1, 5));
        assertEquals(2, SearchingAlgorithms.binarySearch(searchArray2, 2));
        assertEquals(2, SearchingAlgorithms.binarySearch(shortArray, 2));
    }

    @Test
    public void binarySearch_IntegerArray_Exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SearchingAlgorithms.binarySearch(notSortedArray, 2);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SearchingAlgorithms.binarySearch(emptyArray, 2);
        });
    }
}

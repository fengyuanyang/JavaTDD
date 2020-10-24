package com.ordestiny.tdd.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {

    private final int[] searchArray1 = {1, 2, 3, 4, 5, 6, 7};
    private final int[] searchArray2 = {1, 2, 3, 4, 5, 6, 7, 8};
    private final int[] notSortedArray = {1, 2, 3, 8, 5, 6, 7, 4};
    private final int[] emptyArray = {};
    private final int[] uninitialisedArray = null;
    private final int[] searchArray3 = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};

    @Test
    public void linearSearch_IntegerArray() {
        assertEquals(0, SearchingAlgorithms.linearSearch(searchArray1, 1));
        assertEquals(7, SearchingAlgorithms.linearSearch(searchArray2, 8));
        assertEquals(5, SearchingAlgorithms.linearSearch(notSortedArray, 6));
        assertEquals(6, SearchingAlgorithms.linearSearch(searchArray3, 110));
        assertEquals(-1, SearchingAlgorithms.linearSearch(searchArray3, 175));
    }

    @Test
    public void linearSearch_IntegerArray_Exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SearchingAlgorithms.binarySearch(emptyArray, 60);
        });
    }

}

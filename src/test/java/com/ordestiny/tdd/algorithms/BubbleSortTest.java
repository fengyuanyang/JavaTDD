package com.ordestiny.tdd.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    private final int[] notSortedArray = {8, 7, 6, 5, 4, 3, 2, 1, 0};
    private final int[] sortedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};

    @Test
    public void bubbleSort_IntegerArray_notSorted() {
        assertArrayEquals(sortedArray, SortingAlgorithms.bubbleSort(notSortedArray));
    }

    @Test
    public void bubbleSort_IntegerArray_sorted() {
        assertArrayEquals(sortedArray, SortingAlgorithms.bubbleSort(sortedArray));
    }

}

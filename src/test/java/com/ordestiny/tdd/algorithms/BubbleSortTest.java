package com.ordestiny.tdd.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void bubbleSort_UnsortedArray_SortedArray() {
        int[] inputArray = {5, 1, 4, 2, 8};
        int[] expectedArray = {1, 2, 4, 5, 8};
        assertArrayEquals(expectedArray, bubbleSort.sort(inputArray));
    }

    @Test
    public void bubbleSort_ReverseSortedArray_SortedArray() {
        int[] inputArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectedArray, bubbleSort.sort(inputArray));
    }
}

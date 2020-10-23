package com.ordestiny.tdd.algorithms;

public class BubbleSort {

    /**
     * Sort integer array with Bubble Sort Algorithm
     *
     * @param array
     * @return sorted array
     */
    public int[] sort(int[] array) {
        int size = array.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

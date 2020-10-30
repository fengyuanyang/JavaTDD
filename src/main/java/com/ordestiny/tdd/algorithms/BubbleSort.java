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
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                swap(array, j);
            }
        }
        return array;
    }

    public void swap(int[] array, int j) {
        int temp = 0;
        if (array[j - 1] > array[j]) {
            temp = array[j - 1];
            array[j - 1] = array[j];
            array[j] = temp;
        }
    }
}
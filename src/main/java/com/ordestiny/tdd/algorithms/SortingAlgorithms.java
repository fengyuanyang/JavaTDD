package com.ordestiny.tdd.algorithms;

public class SortingAlgorithms {

    /**
     * Sorting algorithm that works by repeatedly swapping the adjacent elements if they are in decreasing order.
     * @param array
     */
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] > array[j])
                    swap(i, j, array);
        return array;
    }

    /**
     * Swaps values at given indices for an array.
     * @param i
     * @param j
     * @param array
     */
    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

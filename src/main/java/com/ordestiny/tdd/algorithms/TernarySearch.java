package com.ordestiny.tdd.algorithms;

public class TernarySearch {
    public int search(int[] array, int searchNumber) {
        if (!isSorted(array)) {
            throw new IllegalArgumentException();
        }

        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if (array[mid1] == searchNumber) {
                return mid1;
            }

            if (array[mid2] == searchNumber) {
                return mid2;
            }

            if (searchNumber > array[mid2]) {
                low = mid2 + 1;
            } else if (searchNumber < array[mid1]) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
    }

    private boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}

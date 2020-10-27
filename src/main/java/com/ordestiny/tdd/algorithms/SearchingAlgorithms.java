package com.ordestiny.tdd.algorithms;

public class SearchingAlgorithms {

    /**
     * Counting number of steps needed to find a given key in integer array.
     *
     * @param searchArray
     * @param key
     * @return integer
     */
    public static int binarySearch(int[] searchArray, int key) {
        if (isNotSorted(searchArray)) {
            throw new IllegalArgumentException("searchArray must be in asc order");
        } else if (searchArray.length < 2) {
            throw new IllegalArgumentException("Array length must be greater than 1");
        }

        int left = 0;
        int right = searchArray.length - 1;

        int numOfSteps = 0;

        while (left <= right) {
            numOfSteps++;

            int mid = (left + right) / 2;

            if (searchArray[mid] < key) {
                left = mid + 1;
            } else if (searchArray[mid] > key) {
                right = mid - 1;
            } else if (searchArray[mid] == key) {
                break;
            }
        }
        return numOfSteps;
    }

    /**
     * Checks if given arrays is not sorted.
     *
     * @param searchArray
     * @return boolean
     */
    private static boolean isNotSorted(int[] searchArray) {
        for (int i = 0; i < searchArray.length - 1; i++) {
            if (searchArray[i] > searchArray[i + 1]) {
                return true;
            }
        }

        return false;
    }

    /**
     * Sequentially checks each element of the list until a match is found for given key or the whole list has been searched.
     * Returns 0-based index if match is found, otherwise, returns -1.
     *
     * @param searchArray
     * @param key
     * @return integer
     */
    public static int linearSearch(int[] searchArray, int key) {
        for(int i = 0; i < searchArray.length; i++) {
            if(searchArray[i] == key){
                return i;
            }
        }
        return -1;
    }

}

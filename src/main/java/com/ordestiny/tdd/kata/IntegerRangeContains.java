package com.ordestiny.tdd.kata;

/**
 *
 * @author ramon.sales
 */
public class IntegerRangeContains {
    
    /**
     * Verify if a integer array contains inside a range of integer numbers.
     * 
     * @param start begin of array.
     * @param end end of array.
     * @param compareArray integer array.
     * @return a boolean to verify result or a exception if array was empty.
     */
    public boolean rangeContainsAll(int start, int end, int[] compareArray) {
        try {
            for (int i : compareArray) {
                
                // Verify if value is inside a range.
                if (i < start || i >= end) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }

    }
}

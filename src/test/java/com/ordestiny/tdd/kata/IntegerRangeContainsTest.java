package com.ordestiny.tdd.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ramon.sales
 */
public class IntegerRangeContainsTest {

    IntegerRangeContains integerRangeContains = new IntegerRangeContains();

    @Test
    public void integerRangeTest01_whenFirstRangeContainsSecondRange_returnTrue() {
        int[] compareArray = {2, 4};
        int start = 2;
        int end = 6;

        Assertions.assertTrue(integerRangeContains.rangeContainsAll(start, end, compareArray));
    }
    
    @Test
    public void integerRangeTest02_whenFirstRangeDontContainsSecondRange_returnFalse() {
        int[] compareArray = {2, 4, 7};
        int start = 2;
        int end = 6;

        Assertions.assertFalse(integerRangeContains.rangeContainsAll(start, end, compareArray));
    }
    
    @Test
    public void integerRangeTest03_whenFirstRangeDontContainsSecondRange_returnFalse() {
        int[] compareArray = {-1, 1, 6, 10};
        int start = 2;
        int end = 6;

        Assertions.assertFalse(integerRangeContains.rangeContainsAll(start, end, compareArray));
    }

    @Test
    public void integerRangeTest04_whenCompareArrayIsNull_returnException() {
        int[] compareArray = null;
        int start = 2;
        int end = 26;

        assertThrows(IllegalArgumentException.class, () -> integerRangeContains.rangeContainsAll(start, end, compareArray));
        
    }
}

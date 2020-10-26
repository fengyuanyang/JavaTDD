package com.ordestiny.tdd.kata;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ramon.sales
 */
public class EqualsTest {

    private Equals equals = new Equals();
    
    @Test
    public void equalsTest01_whenFirstRangeIsEqualsToTheSecond_returnTrue(){
        int start = 3;
        int end = 5;
        int compareStart = 3;
        int compareEnd = 5;
        
        Assertions.assertTrue(equals.containsRange(start, end, compareStart, compareEnd));
    }
    
    @Test
    public void equalsTest02_whenFirstRangeIsNotEqualsToTheSecond_returnFalse(){
        int start = 2;
        int end = 10;
        int compareStart = 3;
        int compareEnd = 5;
        
        Assertions.assertFalse(equals.containsRange(start, end, compareStart, compareEnd));
    }
    
    @Test
    public void equalsTest03_whenFirstRangeIsNotEqualsToTheSecond_returnFalse(){
        int start = 2;
        int end = 5;
        int compareStart = 3;
        int compareEnd = 10;
        
        Assertions.assertFalse(equals.containsRange(start, end, compareStart, compareEnd));
    }
    
    @Test
    public void equalsTest04_whenFirstRangeIsNotEqualsToTheSecond_returnFalse(){
        int start = 3;
        int end = 5;
        int compareStart = 2;
        int compareEnd = 10;
        
        Assertions.assertFalse(equals.containsRange(start, end, compareStart, compareEnd));
    }
    
    @Test
    public void equalsTest05_whenFirstRangeIsInverted_returnException(){
        int start = 5;
        int end = 3;
        int compareStart = 3;
        int compareEnd = 5;
        
        assertThrows(IllegalArgumentException.class, () -> equals.containsRange(start, end, compareStart, compareEnd));
    }
    
    @Test
    public void equalsTest06_whenSecondRangeIsInverted_returnException(){
        int start = 3;
        int end = 5;
        int compareStart = 5;
        int compareEnd = 3;
        
        assertThrows(IllegalArgumentException.class, () -> equals.containsRange(start, end, compareStart, compareEnd));
    }
}

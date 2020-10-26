package com.ordestiny.tdd.kata;

/**
 *
 * @author ramon.sales
 */
public class Equals {

    public boolean containsRange(int start, int end, int compareStart, int compareEnd) throws IllegalArgumentException{

        if ((start > end) || (compareStart > compareEnd)) {
            throw new IllegalArgumentException();
        } else if((start == compareStart) && (end == compareEnd)) {
            return true;
        } 
        
        return false;
    }
}

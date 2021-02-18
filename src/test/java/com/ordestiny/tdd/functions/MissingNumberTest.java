package com.ordestiny.tdd.functions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {


    @Test
    public void testMissingNumberFail() {

        int a[] = {1, 2, 4, 5, 6};
        int missedNumber = MissingNumber.getMissingNo(a);
        // assert
        assertEquals(7, missedNumber);
    }


    @Test
    public void testMissingNumberPassed() {

        int a[] = {1, 2, 3, 4, 5, 6, 8};
        int missedNumber = MissingNumber.getMissingNo(a);
        // assert
        assertEquals(7, missedNumber);
    }
}
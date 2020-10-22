package com.ordestiny.tdd.leapyear;

import org.junit.jupiter.api.Test;

import static com.ordestiny.tdd.leapyear.LeapYear.isLeapYear;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void is2000ALeapYear() {
        assertTrue(isLeapYear(2000));
    }

    @Test
    void is1900NotLeapYear() {
        assertFalse(isLeapYear(1900));
    }
}

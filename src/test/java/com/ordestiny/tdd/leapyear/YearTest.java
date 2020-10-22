package com.ordestiny.tdd.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* author fengyuan yang coolsealtw@hotmail.com
 */
class YearTest {
    private Year year;

    @Test
    void shouldReturnFalseIfYearIsNotALeapYear() {
        year = new Year(2015);
        Assertions.assertFalse(year.isLeapYear());
    }

    @Test
    void shouldReturnFalseIfYearIsMultipleOfHundred() {
        year = new Year(1000);
        Assertions.assertFalse(year.isLeapYear());
    }

    @Test
    void shouldReturnTrueIfYearIsMultipleOfFourHundred() {
        year = new Year(2000);
        Assertions.assertTrue(year.isLeapYear());
    }

    @Test
    void shouldReturnTrueIfYearIsMultipleOfFour() {
        year = new Year(2000);
        Assertions.assertTrue(year.isLeapYear());
    }

    @Test
    void shouldReturnTrueIfYearIsALeapYear() {
        year = new Year(2016);
        Assertions.assertTrue(year.isLeapYear());
    }
}

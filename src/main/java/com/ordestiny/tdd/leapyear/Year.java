package com.ordestiny.tdd.leapyear;

public class Year {

    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        return false;
    }
}

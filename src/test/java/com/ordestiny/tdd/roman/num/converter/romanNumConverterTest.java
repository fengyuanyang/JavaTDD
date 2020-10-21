package com.ordestiny.tdd.roman.num.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class romanNumConverterTest {

    RomanNumConverter romanNumConverter = new RomanNumConverter();

    @Test
    public void romanNumConverter() {
        assertEquals("MMMCMXCIX",romanNumConverter.convert_roman_numeral(3999));
    }

    @Test
    public void romanNumConverterTestFor_9() {
        assertEquals("IX",romanNumConverter.convert_roman_numeral(9));
    }

    @Test
    public void romanNumConverterTestFor_0() {
        assertThrows(IllegalArgumentException.class, () -> romanNumConverter.convert_roman_numeral(0));
    }


    @Test
    public void romanNumConverterTestFor_4000() {
        assertThrows(IllegalArgumentException.class, () -> romanNumConverter.convert_roman_numeral(4000));
    }

}
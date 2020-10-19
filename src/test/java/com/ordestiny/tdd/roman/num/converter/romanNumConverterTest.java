package com.ordestiny.tdd.roman.num.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class romanNumConverterTest {

    RomanNumConverter romanNumConverter = new RomanNumConverter();

    @Test
    public void romanNumConverter() {
        assertEquals("MMMCMXCIX",romanNumConverter.convert_roman_numeral(3999));
    }
}
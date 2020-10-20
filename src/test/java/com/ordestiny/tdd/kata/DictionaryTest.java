package com.ordestiny.tdd.kata;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DictionaryTest {

    private Dictionary replacer = new Dictionary();

    @Test
    public void replaceAll_whenStringAndDictionaryIsEmpty_returnEmptyString() {
        String inputString = "";
        String expectedOutputString = "";

        Map<String, String> dict = new HashMap<String, String>();

        assertTrue(inputString.matches(replacer.replaceAll(expectedOutputString, dict)));
    }

    @Test
    public void replaceAll_whenStringReplacedByOneElementInDictionary_returnEmptyString() {
        String inputString = "/$temp/$";
        String expectedString = "temporary";

        Map<String, String> dict = new HashMap<String, String>();
        dict.put("temp", "temporary");

        assertTrue(expectedString.matches(replacer.replaceAll(inputString, dict)));
    }

    @Test
    public void replaceAll_whenStringReplacedByTwoElementsInDictionary_returnEmptyString() {
        String inputString = "/$temp/$ here comes the name /$name/$";
        String expectedString = "temporary here comes the name John Doe";

        Map<String, String> dict = new HashMap<String, String>();
        dict.put("temp", "temporary");
        dict.put("name", "John Doe");

        assertTrue(expectedString.matches(replacer.replaceAll(inputString, dict)));
    }
}

package com.ordestiny.tdd.kata;

import java.util.Map;

public class Dictionary {

    /**
     * Replaces all the matching key string with the value
     *
     * @param inputString
     * @param dict
     * @return string which replaced the keys in the inputString with the value of the dict
     */
    public String replaceAll(String inputString, Map<String, String> dict) {
        for (Map.Entry<String, String> entry : dict.entrySet()) {
            String keyString = "/$" + entry.getKey() + "/$";
            inputString = inputString.replace(keyString, entry.getValue());
        }

        return inputString;
    }
}

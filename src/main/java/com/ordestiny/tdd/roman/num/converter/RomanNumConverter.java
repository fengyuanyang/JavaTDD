package com.ordestiny.tdd.roman.num.converter;

import java.util.ArrayList;
import java.util.HashMap;

public class RomanNumConverter {
     ArrayList<Integer> digits = new ArrayList<>();
     private final HashMap<Integer, String> ones = new HashMap<Integer, String>();
     private final HashMap<Integer, String> tens = new HashMap<Integer, String>();
     private final HashMap<Integer, String> hundreds = new HashMap<Integer, String>();
     private final HashMap<Integer, String> thousands = new HashMap<Integer, String>();

     {
        ones.put(0, "");
        ones.put(1, "I");
        ones.put(2, "II");
        ones.put(3, "III");
        ones.put(4, "IV");
        ones.put(5, "V");
        ones.put(6, "VI");
        ones.put(7, "VII");
        ones.put(8, "VIII");
        ones.put(9, "IX");

        tens.put(0, "");
        tens.put(1, "X");
        tens.put(2, "XX");
        tens.put(3, "XXX");
        tens.put(4, "XL");
        tens.put(5, "L");
        tens.put(6, "LX");
        tens.put(7, "LXX");
        tens.put(8, "LXXX");
        tens.put(9, "XC");

        hundreds.put(0, "");
        hundreds.put(1, "C");
        hundreds.put(2, "CC");
        hundreds.put(3, "CCC");
        hundreds.put(4, "CD");
        hundreds.put(5, "D");
        hundreds.put(6, "DC");
        hundreds.put(7, "DCC");
        hundreds.put(8, "DCCC");
        hundreds.put(9, "CM");

        thousands.put(0, "");
        thousands.put(1, "M");
        thousands.put(2, "MM");
        thousands.put(3, "MMM");

    }

    /***
     * add number digits to digits arrayList
     * @param number input number
     */
     private void getDigits(int number) {
        while (number / 10 != 0) {
            digits.add(number % 10);
            number /= 10;
        }
        digits.add(number % 10);
    }

    /***
     * convert any number between 0 and 3999 to Roman numeral
     * @param n Input number
     * @return Roman numeral format of n
     */
     public String convert_roman_numeral(int n) {

        if (n >= 4000 || n == 0) throw new IllegalArgumentException("Enter a valid Roman Numeral or Integer from 1 to 3,999.");


        String res_ones = "";
        String res_tens = "";
        String res_hundreds = "";
        String res_thousands = "";
        String result;

        getDigits(n);

        if (digits.size() > 0) res_ones = ones.get(digits.get(0));
        if (digits.size() > 1) res_tens = tens.get(digits.get(1));
        if (digits.size() > 2) res_hundreds = hundreds.get(digits.get(2));
        if (digits.size() > 3) res_thousands = thousands.get(digits.get(3));

        result = res_thousands + res_hundreds + res_tens + res_ones;

        return result;
    }


    


}

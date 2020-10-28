package com.ordestiny.tdd.conditional;

import java.util.Scanner;

public class Statements {

    /**
     *  If the number lies between 10 and 99999
     *  then the method returns the number of digits 
     *
     * @param number
     * @return String
     */
    public String ifElseIf(int number) {
        if (number < 100 && number >= 10) {
            return ("2 digit number");
        } else if (number < 1000 && number >= 100) {
            return ("3 digit number");
        } else if (number < 10000 && number >= 1000) {
            return ("4 digit number");
        } else if (number < 100000 && number >= 10000) {
            return ("5 digit number");
        } else {
            return ("Number is not between 10 & 99999");
        }
    }

    public String switchStatement(Double number1, char operator, Double number2) {

        /**
         *  Selects operator using switch 
         *  to perform the operation and get the result
         *
         * @param number1
         * @param operator
         * @param number2
         */
        Double result;

        switch (operator) {

            case '+':
                result = number1 + number2;
                return (number1 + " + " + number2 + " = " + result);

            case '-':
                result = number1 - number2;
                return (number1 + " - " + number2 + " = " + result);

            case '*':
                result = number1 * number2;
                return (number1 + " * " + number2 + " = " + result);

            case '/':
                result = number1 / number2;
                return (number1 + " / " + number2 + " = " + result);

            default:
                return ("Invalid operator!");
        }

    }
}

package com.ordestiny.tdd.conditions;

public class Conditions {

    /**
     * @param first integer parameter
     * @param second integer parameter
     * @return greater of the two integers
     */
    public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    /**
     * @param first integer parameter
     * @param second integer parameter
     * @return greater of the two integers. The same as @getMax but using ternary operator
     */
    public static int getMaxTernary(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * @param first integer parameter
     * @param second integer parameter
     * @return less of the two integers
     */
    public static int getMin(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }

    /**
     * @param first integer parameter
     * @param second integer parameter
     * @return less of the two integers. The same as @getMin but using ternary operator
     */
    public static int getMinTernary(int first, int second) {
        return first < second ? first : second;
    }

    /**
     * @param first integer parameter
     * @param second integer parameter
     * @return true if integers are equal
     */
    public static boolean areEqual(int first, int second) {
        return first == second;
    }

    /**
     * @param first integer parameter
     * @param second integer parameter
     * @return true if integers are not equal
     */
    public static boolean areNotEqual(int first, int second) {
        return first != second;
    }

    /**
     * @param number checked number
     * @param limit limit (included)
     * @return true if @number is in the interval <0,limit> (both included)
     */
    public static boolean isPositiveInLimit(int number, int limit) {
        // limit should be always positive
        return number >= 0 && number <= limit;
    }

    /**
     * @param number checked number
     * @param limit limit (included)
     * @return true if @number is in the interval <limit,0> (both included)
     */
    public static boolean isNegativeInLimit(int number, int limit) {
        // limit should be always negative
        return number < 0 && number >= limit;
    }
}

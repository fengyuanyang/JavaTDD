package com.ordestiny.tdd.kata;

import java.math.BigDecimal;

public class FooBarQix {

  private static final BigDecimal THREE = new BigDecimal(3);
  private static final BigDecimal FIVE = new BigDecimal(5);
  private static final BigDecimal SEVEN = new BigDecimal(7);
  private static final String FOO = "Foo";
  private static final String BAR = "Bar";
  private static final String QIX = "Qix";

  /**
   * If the number is divisible by 3, write “Foo” instead of the number
   * If the number is divisible by 5, add “Bar”
   * If the number is divisible by 7, add “Qix”
   * For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.
   * @param input the number you want to compute
   * @return FooBarQix result or original number
   */
  public static String compute(String input) {
    String result = "";
    BigDecimal number = new BigDecimal(input);
    if (number.divideAndRemainder(THREE)[1].compareTo(BigDecimal.ZERO) == 0) {
      result += FOO;
    }
    if (number.divideAndRemainder(FIVE)[1].compareTo(BigDecimal.ZERO) == 0) {
      result += BAR;
    }
    if (number.divideAndRemainder(SEVEN)[1].compareTo(BigDecimal.ZERO) == 0) {
      result += QIX;
    }
    String computeFBQNumber = "";
    while (number.compareTo(BigDecimal.ZERO) > 0) {
      BigDecimal[] divide10 = number.divideAndRemainder(new BigDecimal(10));
      if (divide10[1].compareTo(THREE) == 0) {
        computeFBQNumber = FOO + computeFBQNumber;
      }
      if (divide10[1].compareTo(FIVE) == 0) {
        computeFBQNumber = BAR + computeFBQNumber;
      }
      if (divide10[1].compareTo(SEVEN) == 0) {
        computeFBQNumber = QIX + computeFBQNumber;
      }
      number = divide10[0];
    }
    result += computeFBQNumber;
    return result.length() == 0 ? input : result;
  }
}

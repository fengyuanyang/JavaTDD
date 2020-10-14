package com.ordestiny.tdd.conditional;

public class IntegerEquality {

  /**
   * If the first integer is equal to second integer then the method returns true else the method
   * returns false
   *
   * @param first java.lang.Integer
   * @param second java.lang.Integer
   * @return a boolean
   */
  public boolean isEqual(Integer first, Integer second) {
    return first.equals(second);
  }

  /**
   * If the first integer is not equal to second integer then the method returns true else the
   * method returns false
   *
   * @param first java.lang.Integer
   * @param second java.lang.Integer
   * @return a boolean
   */
  public boolean isNotEqual(Integer first, Integer second) {
    return !first.equals(second);
  }

  /**
   * If the first integer is less than second integer then the method returns true else the method
   * returns false
   *
   * @param first
   * @param second
   * @return
   */
  public boolean firstIsLessThanSecond(Integer first, Integer second) {
    return first < second;
  }

  /**
   * If the first integer is more than second then the method returns true else the method returns
   * false
   *
   * @param first java.lang.Integer
   * @param second java.lang.Integer
   * @return boolean
   */
  public boolean firstIsMoreThanSecond(Integer first, Integer second) {
    return first > second;
  }

  /**
   * If the first integer is less than or equal to second integer then the method returns true else
   * the method returns false
   *
   * @param first java.lang.Integer
   * @param second java.lang.Integer
   * @return boolean
   */
  public boolean firstIsLessThanOrEqualToSecond(Integer first, Integer second) {
    return first <= second;
  }

  /**
   * If the first integer is more than or equal to second integer then the method returns true else
   * returns false
   *
   * @param first java.lang.Integer
   * @param second java.lang.Integer
   * @return boolean
   */
  public boolean firstIsMoreThanOrEqualToSecond(Integer first, Integer second) {
    return first >= second;
  }
}

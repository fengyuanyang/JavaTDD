package com.ordestiny.tdd.kata;

import java.util.Arrays;

public class Diamond {

  public final static char BASE_CHARACTER = 'A';

  private Diamond() {

  }

  /**
   * Build a string that represents a diamond based on a given character which is the widest point character in the
   * constructed diamond.
   *
   * @param widestPointChar
   *     The character that is used to construct the widest points (diagonal) in th diamond.
   * @return Constructed diamond string based on the given widest point character.
   * @throws IllegalArgumentException
   *     If the argument provided as the widest point character is out of the A-Z range.
   * @implNote For sake of simplicity, spaces and new lines are not included in the Diamond
   *     string.
   */
  public static String buildDiamond(char widestPointChar) throws IllegalArgumentException {
    if (!Character.isUpperCase(widestPointChar)) {
      throw new IllegalArgumentException("Supplied widest point character is not valid. Only A-Z is accepted.");
    }

    StringBuilder leftPart = new StringBuilder();
    int offset = widestPointChar - BASE_CHARACTER;
    for (int i = 0; i < offset; i++) {
      for (int j = 0; j < i + 1; j++) {
        leftPart.append((char) (BASE_CHARACTER + i));
      }
    }
    char[] diagonalString = new char[offset + 1];
    Arrays.fill(diagonalString, widestPointChar);
    StringBuilder rightPart = new StringBuilder(leftPart).reverse();
    return leftPart + String.valueOf(diagonalString) + rightPart;
  }
}

package com.ordestiny.tdd.conditions;

import java.math.BigInteger;

public class TimeConversion {

  private TimeConversion() {

  }

  public static String convertToTwentyFourClockTime(String s) {
    BigInteger hour = new BigInteger(s.substring(0, 2));
    String meridiem = s.substring(s.length() - 2);
    if (hour.intValue() > 12) {
      throw new IllegalArgumentException("Invalid 12-hour clock format");
    } else if (meridiem.equals("PM") && hour.intValue() < 12) {
      hour = hour.add(new BigInteger("12"));
    } else if (meridiem.equals("AM") && hour.intValue() == 12) {
      hour = new BigInteger("0");
    }
    return String.format("%02d%s", hour.intValue(), s.substring(2, s.length() - 2));
  }
}

package com.ordestiny.tdd.Conditions;

import com.ordestiny.tdd.conditions.TimeConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TimeConversionTest {

  @Test
  void ConvertToTwentyFourClockTime_SevenAM_ShouldReturnSeven() {
    // When
    String actual = TimeConversion.convertToTwentyFourClockTime("07:05:45AM");

    // Then
    assertEquals("07:05:45", actual);
  }

  @Test
  void ConvertToTwentyFourClockTime_SevenPM_ShouldReturnNineteen() {
    // When
    String actual = TimeConversion.convertToTwentyFourClockTime("07:05:45PM");

    // Then
    assertEquals("19:05:45", actual);
  }

  @Test
  void ConvertToTwentyFourClockTime_FourPM_ShouldReturnSixteen() {
    // When
    String actual = TimeConversion.convertToTwentyFourClockTime("04:59:59PM");

    // Then
    assertEquals("16:59:59", actual);
  }

  @Test
  void ConvertToTwentyFourClockTime_TwelvePM_ShouldReturnTwelve() {
    // When
    String actual = TimeConversion.convertToTwentyFourClockTime("12:01:00PM");

    // Then
    assertEquals("12:01:00", actual);
  }

  @Test
  void ConvertToTwentyFourClockTime_TwelveAM_ShouldReturnZero() {
    // When
    String actual = TimeConversion.convertToTwentyFourClockTime("12:01:00AM");

    // Then
    assertEquals("00:01:00", actual);
  }

  @Test
  void ConvertToTwentyFourClockTime_ZeroAM_ShouldReturnZero() {
    // When
    String actual = TimeConversion.convertToTwentyFourClockTime("00:01:00AM");

    // Then
    assertEquals("00:01:00", actual);
  }

  @Test
  void ConvertToTwentyFourClockTime_ThirteenPM_ShouldThrowIllegalArgumentException() {
    // When
    // Then
    assertThrows(IllegalArgumentException.class, () -> TimeConversion.convertToTwentyFourClockTime("13:00:01PM"));
  }

  @Test
  void ConvertToTwentyFourClockTime_TwentyThreeAM_ShouldThrowIllegalArgumentException() {
    // When
    // Then
    assertThrows(IllegalArgumentException.class, () -> TimeConversion.convertToTwentyFourClockTime("23:00:01AM"));
  }
}
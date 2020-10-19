package com.ordestiny.tdd.Conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ordestiny.tdd.conditions.Switch;
import java.time.DayOfWeek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SwitchTest {

  private final Switch switchImp = new Switch();

  @Test
  void switchEnum_whenEnumIsNull_ExpectException() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      switchImp.switchEnum(null);
    });
  }

  @ParameterizedTest
  @EnumSource(DayOfWeek.class)
  void switchEnum_whenEnumIsValidWeekday_expectCorrectWeekdayEnum(DayOfWeek weekday) {
    //act
    DayOfWeek expectedWeekday = switchImp.switchEnum(weekday);

    //expect
    assertEquals(expectedWeekday, weekday);
  }

  @Test
  void switchInt_whenIntIsOutOfRange_ExpectException() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      switchImp.switchInt(7);
    });
  }

  @ParameterizedTest
  @ValueSource(ints = { 0, 1, 2, 3, 4, 5, 6 })
  void switchInt_whenIntIsValidWeekday_expectCorrectWeekdayEnum(int weekday) {
    //act
    DayOfWeek expectedWeekday = switchImp.switchInt(weekday);

    //expect
    switch (weekday) {
      case 0:
        assertEquals(expectedWeekday.name(), "SUNDAY");
        break;
      case 1:
        assertEquals(expectedWeekday.name(), "MONDAY");
        break;
      case 2:
        assertEquals(expectedWeekday.name(), "TUESDAY");
        break;
      case 3:
        assertEquals(expectedWeekday.name(), "WEDNESDAY");
        break;
      case 4:
        assertEquals(expectedWeekday.name(), "THURSDAY");
        break;
      case 5:
        assertEquals(expectedWeekday.name(), "FRIDAY");
        break;
      case 6:
        assertEquals(expectedWeekday.name(), "SATURDAY");
        break;
    }
  }

  @Test
  void switchString_whenStringRepresentationIsOutOfRange_ExpectException() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      switchImp.switchString("7");
    });
  }

  @ParameterizedTest
  @ValueSource(strings = { "0", "1", "2", "3", "4", "5", "6" })
  void switchString_whenStringRepresentationIsValidWeekday_expectCorrectWeekdayEnum(String weekday) {
    //act
    DayOfWeek expectedWeekday = switchImp.switchString(weekday);

    //expect
    switch (weekday) {
      case "0":
        assertEquals(expectedWeekday.name(), "SUNDAY");
        break;
      case "1":
        assertEquals(expectedWeekday.name(), "MONDAY");
        break;
      case "2":
        assertEquals(expectedWeekday.name(), "TUESDAY");
        break;
      case "3":
        assertEquals(expectedWeekday.name(), "WEDNESDAY");
        break;
      case "4":
        assertEquals(expectedWeekday.name(), "THURSDAY");
        break;
      case "5":
        assertEquals(expectedWeekday.name(), "FRIDAY");
        break;
      case "6":
        assertEquals(expectedWeekday.name(), "SATURDAY");
        break;
    }
  }
}

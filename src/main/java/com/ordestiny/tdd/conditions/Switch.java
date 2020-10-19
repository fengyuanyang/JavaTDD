package com.ordestiny.tdd.conditions;

import java.time.DayOfWeek;
import java.util.Objects;

public class Switch {

  /**
   * Use switch to find day of the week in a given enum.
   *
   * @param weekday
   *     Day of the week as represented in {@link DayOfWeek}
   * @return Day of the week
   */
  public DayOfWeek switchEnum(DayOfWeek weekday) {
    if (Objects.isNull(weekday)) {
      throw new IllegalArgumentException("Weekday is null");
    }
    switch (weekday) {
      case FRIDAY:
        return DayOfWeek.FRIDAY;
      case SATURDAY:
        return DayOfWeek.SATURDAY;
      case SUNDAY:
        return DayOfWeek.SUNDAY;
      case MONDAY:
        return DayOfWeek.MONDAY;
      case TUESDAY:
        return DayOfWeek.TUESDAY;
      case WEDNESDAY:
        return DayOfWeek.WEDNESDAY;
      case THURSDAY:
        return DayOfWeek.THURSDAY;
      default:
        throw new IllegalArgumentException("Supplied weekday argument is not valid");
    }
  }

  /**
   * Use switch to find day of the week using a given integer that represents day of the week.
   *
   * @param weekday
   *     Day of the week represented by an integer
   * @return Day of the week
   */
  public DayOfWeek switchInt(int weekday) {
    switch (weekday) {
      case 0:
        return DayOfWeek.SUNDAY;
      case 1:
        return DayOfWeek.MONDAY;
      case 2:
        return DayOfWeek.TUESDAY;
      case 3:
        return DayOfWeek.WEDNESDAY;
      case 4:
        return DayOfWeek.THURSDAY;
      case 5:
        return DayOfWeek.FRIDAY;
      case 6:
        return DayOfWeek.SATURDAY;
      default:
        throw new IllegalArgumentException("Supplied weekday argument is not valid");
    }
  }

  /**
   * Use switch to find day of the week using a given string that represents day of the week.
   *
   * @param weekday
   *     Day of the week represented by an string
   * @return Day of the week
   */
  public DayOfWeek switchString(String weekday) {
    switch (weekday) {
      case "0":
        return DayOfWeek.SUNDAY;
      case "1":
        return DayOfWeek.MONDAY;
      case "2":
        return DayOfWeek.TUESDAY;
      case "3":
        return DayOfWeek.WEDNESDAY;
      case "4":
        return DayOfWeek.THURSDAY;
      case "5":
        return DayOfWeek.FRIDAY;
      case "6":
        return DayOfWeek.SATURDAY;
      default:
        throw new IllegalArgumentException("Supplied weekday argument is not valid");
    }
  }

}


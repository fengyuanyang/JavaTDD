package com.ordestiny.tdd.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ForLoopBreakTest {

  private final ForLoopBreak loop = new ForLoopBreak();

  @ParameterizedTest(name = "when loop stops at {0} and breaks at {1}, it should return {2}")
  @CsvSource({ "10, 8, 8", "10, 0, 0", "10, 10, 10" })
  void forLoopBreakTest(int end, int stop, int expectedResult) {
    int actual = loop.standardForLoopWithBreak(end, stop);
    Assertions.assertEquals(expectedResult, actual);
  }

  @Test
  void forLoopBreakWithInvalidEndTest() {
    final int end = -1, stop = 10;
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      loop.standardForLoopWithBreak(end, stop);
    });
  }
}

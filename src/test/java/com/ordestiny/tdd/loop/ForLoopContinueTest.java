package com.ordestiny.tdd.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ForLoopContinueTest {

  private final ForLoopContinue loop = new ForLoopContinue();

  @ParameterizedTest(name = "when loop stops at {0} and continue at {1}, it should return {2}")
  @CsvSource({ "10, 8, 10", "10, 0, 10", "10, 10, 10" })
  void forLoopContinueTest(int end, int continueAt, int expectedResult) {
    int actual = loop.standardForLoopWithContinue(end, continueAt);
    Assertions.assertEquals(expectedResult, actual);
  }

  @Test
  void forLoopContinueWithInvalidEndTest() {
    final int end = -1, continueAt = 10;
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      loop.standardForLoopWithContinue(end, continueAt);
    });
  }
}

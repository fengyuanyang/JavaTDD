package com.ordestiny.tdd.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WhileLoopContinueTest {
  private final WhileLoopContinue loopContinue = new WhileLoopContinue();

  @ParameterizedTest(name = "when loop continue at {0}, it should return {1}")
  @CsvSource({"7, 9", "0, 10", "10, 9", "-1, 10"})
  void whileLoopContinueTest(int continueAt, int expectedResult) {
    int actual = loopContinue.loopContinue(continueAt);
    Assertions.assertEquals(expectedResult, actual);
  }
}

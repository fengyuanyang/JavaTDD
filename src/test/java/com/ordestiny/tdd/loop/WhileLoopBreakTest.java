package com.ordestiny.tdd.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class WhileLoopBreakTest {
  private WhileLoopBreak loopBreak = new WhileLoopBreak();

  @ParameterizedTest(name = "when loop break at {0}, it should return {1}")
  @CsvSource({
    "7, 7", "0, 0", "10, 10", "-1, -10",
  })
  void whenLoopBreakTest(int breakAt, int expectedResult) {
    int actual = loopBreak.loopBreak(breakAt);
    Assertions.assertEquals(expectedResult, actual);
  }
}

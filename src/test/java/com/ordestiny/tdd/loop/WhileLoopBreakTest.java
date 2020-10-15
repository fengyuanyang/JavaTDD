package com.ordestiny.tdd.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WhileLoopBreakTest {
  private WhileLoopBreak loopBreak = new WhileLoopBreak();

  @Test
  void whenLoopBreakAt7_shouldReturn6() {
    int expected = 7;
    int actual = loopBreak.loopBreak(7);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void whenLoopBreakAt0_shouldReturn0() {
    int expected = 0;
    int actual = loopBreak.loopBreak(0);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void whenLoopBreakAt10_shouldReturn10() {
    int expected = 10;
    int actual = loopBreak.loopBreak(10);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void whenLoopBreakAtNegative1_shouldReturn10() {
    int expected = 10;
    int actual = loopBreak.loopBreak(-1);
    Assertions.assertEquals(expected, actual);
  }
}

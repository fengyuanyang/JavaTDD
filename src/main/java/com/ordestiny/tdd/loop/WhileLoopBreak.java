package com.ordestiny.tdd.loop;

public class WhileLoopBreak {
  /**
   * Given 1 int parameter for loops (break) And there is a counter to count the execution times And
   * loop should execute 10 times at most.
   *
   * @param expectedCount
   * @return
   */
  public int loopBreak(int expectedCount) {
    if (expectedCount < 0) {
      return 10;
    }

    int count = 0;
    while (expectedCount > 0 && count < 10) {
      expectedCount--;
      count++;
    }
    return count;
  }
}

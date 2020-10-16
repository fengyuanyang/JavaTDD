package com.ordestiny.tdd.loop;

public class WhileLoopBreak {
  /**
   * Given 1 int parameter for loops (break) And there is a counter to count the execution times And
   * loop should execute 10 times at most.
   *
   * @param breakAt int
   * @return int
   */
  public int loopBreak(int breakAt) {
    int count = 0;
    while (count < 10) {
      if (breakAt == count) {
        break;
      }
      count++;
    }
    return count;
  }
}

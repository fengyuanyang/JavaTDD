package com.ordestiny.tdd.loop;

public class WhileLoopContinue {
  /**
   * Given 1 int parameter for loops (continue) And there is a counter to count the execution times
   * And loop should execute 10 times at most.
   *
   * @param continueAt int
   * @return int
   */
  public int loopContinue(int continueAt) {
    int count = 0;
    int executionTime = 0;
    while (executionTime < 10) {
      executionTime++;
      if (executionTime == continueAt) {
        continue;
      }
      count++;
    }
    return count;
  }
}

package com.ordestiny.tdd.loop;

public class ForLoopContinue {

  /**
   * Standard For loop with {@literal continue} that uses a counter to count number of executions before skipping
   * execution via {@literal continue} keyword.
   *
   * @param end
   *     A value that defines upper bound of the for loop
   * @param stop
   *     A value that determines when the for loop body execution should be skipped
   * @return number of for loop body executions
   */
  public int standardForLoopWithContinue(final int end, final int stop) {
    if (end < 0) {
      throw new IllegalArgumentException("End value should be equal to or greater than zero");
    }
    int count = 0;

    for (int i = 0; i <= end; i++) {
      if (i == stop) {
        continue;
      }
      count++;
    }
    return count;
  }
}

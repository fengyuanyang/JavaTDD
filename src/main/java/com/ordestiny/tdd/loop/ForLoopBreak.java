package com.ordestiny.tdd.loop;

public class ForLoopBreak {

  /**
   * Standard For loop with {@literal break} that uses a counter to count number of executions before terminating via
   * the {@literal break} keyword.
   *
   * @param end
   *     A value that defines the upper bound of the for loop
   * @param stop
   *     A value that determines when the for loop body execution should be terminated
   * @return number of for loop body executions
   */
  public int standardForLoopWithBreak(final int end, final int stop) {
    if (end < 0) {
      throw new IllegalArgumentException("End value should be equal to or greater than zero");
    }
    int count = 0;

    for (int i = 0; i <= end; i++) {
      if (i == stop) {
        break;
      }
      count++;
    }
    return count;
  }
}

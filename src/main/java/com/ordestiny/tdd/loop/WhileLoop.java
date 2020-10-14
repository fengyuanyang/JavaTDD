package com.ordestiny.tdd.loop;

public class WhileLoop {

  /**
   * doWhile.
   *
   * @param times int
   * @return
   */
  public int doWhile(int times) {
    int counter = 0;
    do {
      counter++;
    } while (counter < times);
    return counter;
  }

  /**
   * whileTimes.
   *
   * @param times int
   * @return
   */
  public int whileTimes(int times) {
    int counter = 0;
    while (counter < times) {
      counter++;
    }
    return counter;
  }
}

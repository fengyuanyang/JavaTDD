package com.ordestiny.tdd.loop;

public class WhileLoop {

  public int doWhile(int times) {
    int counter = 0;
    do {
      counter++;
    } while (counter < times);
    return counter;
  }

  public int whileTimes(int times) {
    int counter = 0;
    while (counter < times) {
      counter++;
    }
    return counter;
  }
}

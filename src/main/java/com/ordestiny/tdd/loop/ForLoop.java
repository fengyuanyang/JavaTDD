package com.ordestiny.tdd.loop;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
  /**
   * standardForLoop.
   *
   * @param times int
   * @return
   */
  public List<Integer> standardForLoop(int times) {
    List<Integer> list = new ArrayList<>(times);

    for (int i = 0; i < times; i++) {
      list.add(i);
    }
    return list;
  }

  /**
   * forEachLoop.
   *
   * @param times int
   * @return
   */
  public List<Integer> forEachLoop(int times) {
    List<Integer> input = standardForLoop(times);
    List<Integer> list = new ArrayList<>(times);

    input.forEach(i -> list.add(i));
    return list;
  }

  /**
   * forXinYLoop.
   *
   * @param times int
   * @return
   */
  public List<Integer> forXinYloop(int times) {
    List<Integer> input = standardForLoop(times);
    List<Integer> list = new ArrayList<>(times);

    for (int i : input) {
      list.add(i);
    }

    return list;
  }
}

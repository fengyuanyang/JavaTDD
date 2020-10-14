package com.ordestiny.tdd.loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForLoopTest {
  List<Integer> sample = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
  ForLoop loop = new ForLoop();

  @Test
  void standardForLoopTest() {
    List<Integer> list = loop.standardForLoop(5);
    Assertions.assertTrue(areListsSame(list, sample));
  }

  @Test
  void forEachLoopTest() {
    List<Integer> list = loop.forEachLoop(5);
    Assertions.assertTrue(areListsSame(list, sample));
  }

  @Test
  void forXinYloopTest() {
    List<Integer> list = loop.forXinYloop(5);
    Assertions.assertTrue(areListsSame(list, sample));
  }

  private boolean areListsSame(List<Integer> list1, List<Integer> list2) {
    return list1.containsAll(list2);
  }
}

package com.ordestiny.tdd.loop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ForLoopTest {
    List<Integer> sample = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4));
    ForLoop loop = new ForLoop();

    @Test
    void standardForLoopTest() {
        List<Integer> list = loop.standardForLoop(5);
        assertTrue(areListsSame(list, sample));
    }

    @Test
    void forEachLoopTest() {
        List<Integer> list = loop.forEachLoop(5);
        assertTrue(areListsSame(list, sample));
    }

    @Test
    void forXinYLoopTest() {
        List<Integer> list = loop.forXinYLoop(5);
        assertTrue(areListsSame(list, sample));
    }

    private boolean areListsSame(List<Integer> list1, List<Integer> list2){
        return list1.containsAll(list2);
    }
}

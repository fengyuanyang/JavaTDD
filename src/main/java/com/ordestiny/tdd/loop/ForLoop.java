package com.ordestiny.tdd.loop;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    public List<Integer> standardForLoop(int times) {
        List<Integer> list = new ArrayList<>(times);

        for(int i = 0; i<times; i++){
            list.add(i);
        }
        return list;
    }

    public List<Integer> forEachLoop(int times) {
        List<Integer> input = standardForLoop(times);
        List<Integer> list = new ArrayList<>(times);

        input.forEach(i -> list.add(i));
        return list;
    }

    public List<Integer> forXinYLoop(int times) {
        List<Integer> input = standardForLoop(times);
        List<Integer> list = new ArrayList<>(times);

        for(int i : input) {
            list.add(i);
        }

        return list;
    }
}

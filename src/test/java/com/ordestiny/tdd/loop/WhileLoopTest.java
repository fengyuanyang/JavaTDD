package com.ordestiny.tdd.loop;

import com.ordestiny.tdd.loop.WhileLoop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhileLoopTest {
    private WhileLoop loop = new WhileLoop();

    @Test
    void doWhile_TenTimes_ReturnTen() {
        int result = loop.doWhile(10);
        assertEquals(10, result);
    }

    @Test
    void doWhile_ZeroTimes_ReturnOne() {
        int result = loop.doWhile(0);
        assertEquals(1, result);
    }

    @Test
    void whileTimes_ZeroTimes_ReturnZero() {
        int result = loop.whileTimes(0);
        assertEquals(0, result);
    }

    @Test
    void whileTimes_TenTimes_ReturnTen() {
        int result = loop.whileTimes(10);
        assertEquals(10, result);
    }
}
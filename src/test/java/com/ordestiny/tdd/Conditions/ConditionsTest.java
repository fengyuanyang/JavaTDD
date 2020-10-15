package com.ordestiny.tdd.Conditions;

import com.ordestiny.tdd.conditions.Conditions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionsTest {

    private Conditions conditions = new Conditions();

    @Test
    void getMaxTest() {
        assertEquals(Conditions.getMax(10, 11), 11);
        assertEquals(Conditions.getMax(11, 10), 11);
        assertEquals(Conditions.getMax(10, -11), 10);
        assertEquals(Conditions.getMax(-10, 11), 11);
        assertEquals(Conditions.getMax(-10, -11), -10);

        assertEquals(Conditions.getMax(10, 11), Conditions.getMaxTernary(10, 11));
        assertEquals(Conditions.getMax(11, 10), Conditions.getMaxTernary(11, 10));
    }

    @Test
    void getMinTest() {
        assertEquals(Conditions.getMin(10, 11), 10);
        assertEquals(Conditions.getMin(11, 10), 10);
        assertEquals(Conditions.getMin(10, -11), -11);
        assertEquals(Conditions.getMin(-10, 11), -10);
        assertEquals(Conditions.getMin(-10, -11), -11);

        assertEquals(Conditions.getMin(10, 11), Conditions.getMinTernary(10, 11));
        assertEquals(Conditions.getMin(11, 10), Conditions.getMinTernary(11, 10));
    }

    @Test
    void equalityTest() {
        assertTrue(Conditions.areEqual(5, 5));
        assertTrue(Conditions.areEqual(-5, -5));
        assertFalse(Conditions.areEqual(5, -5));
        assertFalse(Conditions.areEqual(-5, 5));

        assertFalse(Conditions.areNotEqual(5, 5));
        assertFalse(Conditions.areNotEqual(-5, -5));
        assertTrue(Conditions.areNotEqual(5, -5));
        assertTrue(Conditions.areNotEqual(-5, 5));
    }

    @Test
    void positiveIntervalTest() {
        assertTrue(Conditions.isPositiveInLimit(42, 100));
        assertTrue(Conditions.isPositiveInLimit(0, 100));
        assertTrue(Conditions.isPositiveInLimit(100, 100));
        assertFalse(Conditions.isPositiveInLimit(-1, 100));
        assertFalse(Conditions.isPositiveInLimit(50, 40));
    }

    @Test
    void negativeIntervalTest() {
        assertTrue(Conditions.isNegativeInLimit(-42, -100));
        assertFalse(Conditions.isNegativeInLimit(0, -100));
        assertTrue(Conditions.isNegativeInLimit(-100, -100));
        assertFalse(Conditions.isNegativeInLimit(1, -100));
        assertFalse(Conditions.isNegativeInLimit(-1, 40));
    }
}

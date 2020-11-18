package com.ordestiny.tdd.conditional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatementsTest {
    private Statements object = new Statements();

    @Test
    public void ifElseIfTest() {
        //number between 10 and 99999 whose no. of digits is to be found
        assertEquals(object.ifElseIf(20), 2);
        assertEquals(object.ifElseIf(100), 3);
        assertEquals(object.ifElseIf(165), 3);
        assertEquals(object.ifElseIf(9876), 4);
        assertEquals(object.ifElseIf(90909), 5);
        assertEquals(object.ifElseIf(24567), 5);
    }

    @Test
    public void switchStatementTest() {
        assertEquals(object.switchStatement(10, '+', 20), 30);
        assertEquals(object.switchStatement(1234, '-', 891), 343);
        assertEquals(object.switchStatement(17, '*', 987), 16779);
        assertEquals(object.switchStatement(59865, '/', 5), 11973);
        assertEquals(object.switchStatement(1098, '+', 4567), 5665);
        assertEquals(object.switchStatement(1150, '*', 2), 2300);
    }
}

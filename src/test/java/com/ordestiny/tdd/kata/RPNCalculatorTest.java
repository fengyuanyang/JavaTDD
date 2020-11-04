package com.ordestiny.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.function.Function;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class RPNCalculatorTest {

    private static RPNCalculator rpnCalculator;

    @BeforeAll
    public static void init() {
        rpnCalculator = new RPNCalculator();
    }

    @ParameterizedTest
    @MethodSource("testData")
    void calculate(String postExpr, int expected) {
        assertEquals(expected, rpnCalculator.calculate(postExpr));
    }

    @ParameterizedTest
    @MethodSource("exceptionData")
    void calculate(String postExpr, Class<RuntimeException> expected) {
        assertThrows(expected, () -> rpnCalculator.calculate(postExpr));
    }

    private static Stream<Arguments> exceptionData() {
        return Stream.of(
                Arguments.of("/ 5 20", IllegalArgumentException.class),
                Arguments.of("5 / 20", IllegalArgumentException.class),
                Arguments.of("20 5 %", IllegalArgumentException.class)
        );
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("20 5 /", 4),
                Arguments.of("4 2 + 3 -", 3),
                Arguments.of("3 5 8 * 7 + *", 141),
                Arguments.of("", 0),
                Arguments.of(null, 0)
        );
    }
}

package com.ordestiny.tdd.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingTest {
    private final FindMissing findMissing = new FindMissing();

    @ParameterizedTest
    @MethodSource("argumentsForMissingNumber")
    void missingNumber(int[] missingNumbers, int expectMissingNumber) {
        assertEquals(expectMissingNumber, findMissing.missingNumber(missingNumbers));
    }

    private static Stream<Arguments> argumentsForMissingNumber() {
        return Stream.of(Arguments.of(new int[]{1, 2, 4, 6, 3, 7, 8}, 5),
                Arguments.of(new int[]{1, 2, 3, 5}, 4)
        );
    }
}
package com.ordestiny.tdd.concurrent;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;


class SwimmingClassTest {
    private SwimmingClass swimmingClass = new SwimmingClass();

    /**
     * There is a swimming class(with x members), all of them start to swim at the same time.
     *
     * Provide a Swim class with start function, so participant can start swimming.
     * We don't expect they can reach the goal at the same time , but we would like to check all their status at the end just once.
     * @param swimmers
     * @throws InterruptedException
     */
    @ParameterizedTest
    @MethodSource("provideArgumentsForStartSwim")
    public void startSwim_swimmersSwimTogether_returnMapContainsAllSwimmer(final String[] swimmers)  throws InterruptedException {
        // act
        Set<String> set = swimmingClass.startSwim(swimmers);

        // assert
        assertTrue(set.containsAll(Arrays.asList(swimmers)));
    }

    /**
     * parameters for startSwim
     * @return
     */
    private static Stream<Arguments> provideArgumentsForStartSwim() {
        return Stream.of(Arguments.of((Object)new String[] { "A", "B", "C", "D" }));
    }

}
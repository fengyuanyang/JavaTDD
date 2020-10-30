package com.ordestiny.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FooBarQixTest {

  @ParameterizedTest
  @MethodSource("provideFooBarQixData")
  void compute_verifyData(String input, String expected) {
    assertEquals(expected, FooBarQix.compute(input));
  }

  private static Stream<Arguments> provideFooBarQixData() {
    return Stream.of(
        Arguments.of("1", "1"),
        Arguments.of("2", "2"),
        Arguments.of("3", "FooFoo"),
        Arguments.of("4", "4"),
        Arguments.of("5", "BarBar"),
        Arguments.of("6", "Foo"),
        Arguments.of("7", "QixQix"),
        Arguments.of("8", "8"),
        Arguments.of("9", "Foo"),
        Arguments.of("10", "Bar"),
        Arguments.of("13", "Foo"),
        Arguments.of("15", "FooBarBar"),
        Arguments.of("21", "FooQix"),
        Arguments.of("33", "FooFooFoo"),
        Arguments.of("51", "FooBar"),
        Arguments.of("53", "BarFoo")
    );
  }
}

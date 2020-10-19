package com.ordestiny.tdd.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BowlingGameTest {

  @ParameterizedTest
  @MethodSource("provideArgumentsForBowlingGameTest")
  public void calculateScore_verifyGameScore(final String[] frameScores, final int expectedScore) {
    //act
    BowlingGame bowlingGame = new BowlingGame(frameScores);
    final int actualScore = bowlingGame.calculateScore();

    //expect
    assertEquals(expectedScore, actualScore);
  }

  private static Stream<Arguments> provideArgumentsForBowlingGameTest() {
    return Stream.of(Arguments.of(new String[] { "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X" }, 300),
        Arguments.of(new String[] { "9-", "9-", "9-", "9-", "9-", "9-", "9-", "9-", "9-", "9-" }, 90),
        Arguments.of(new String[] { "5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/5" }, 150),
        Arguments.of(new String[] { "5/", "5/", "5-", "5-", "5-", "5-", "5-", "5-", "5-", "5-" }, 70),
        Arguments.of(new String[] { "X", "5/", "5-", "5-", "5-", "5-", "X", "5-", "5-", "5-" }, 85),
        Arguments.of(new String[] { "X", "X", "4/", "X", "X", "6/", "X", "2/", "X", "4/7" }, 207),
        Arguments.of(new String[] { "X", "4/", "53", "6-", "X", "6/", "X", "2/", "X", "4/7" }, 166),
        Arguments.of(new String[] { "X", "4/", "53", "6-", "X", "6/", "X", "2/", "45", "4/7" }, 149),
        Arguments.of(new String[] { "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "7/" }, 287),
        Arguments.of(new String[] { "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "32" }, 278),
        Arguments.of(new String[] { "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "3-" }, 293),
        Arguments.of(new String[] { "4/", "5/", "6/", "X", "X", "X", "X", "2/", "X", "4/7" }, 210));
  }
}

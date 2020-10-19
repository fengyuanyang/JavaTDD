package com.ordestiny.tdd.kata;

import java.util.Arrays;

public class BowlingGame {

  public final static String STRIKE = "X";

  public final static String MISS = "-";

  public final static String SPARE = "/";

  public final int NUMBER_OF_FRAMES_PER_GAME = 10;

  /**
   * An array representing scores for a bowling game. Each array item shows the player's score for that frame.
   */
  private final String[] frameScores;

  /**
   * An array that holds interim scores calculated for each frame
   */
  private int[] interimScores;

  public BowlingGame(String[] frameScores) {
    this.frameScores = frameScores;
    this.interimScores = new int[NUMBER_OF_FRAMES_PER_GAME];
  }

  public int calculateScore() {
    return calculateScore(this.frameScores);
  }

  /**
   * Calculate overall game score based on the given frame scores.
   *
   * @param frameScores
   *     An array representing scores for a bowling game. Each array item shows the player's score for that frame
   * @return Overall player score
   */
  public int calculateScore(final String[] frameScores) {
    ScoreType prevScoreType = ScoreType.OPEN;
    String currentFrameScore;
    int currentFrameIndex = 0;
    int[] separateScores;
    for (; currentFrameIndex < NUMBER_OF_FRAMES_PER_GAME - 1; currentFrameIndex++) {
      currentFrameScore = frameScores[currentFrameIndex];
      separateScores = getSeparateRollScores(currentFrameScore);
      if (prevScoreType == ScoreType.SPARE) {
        interimScores[currentFrameIndex - 1] += separateScores[0];
        if (currentFrameScore.contains(STRIKE)) {
          interimScores[currentFrameIndex - 1] += 10;
        }
      }
      if (prevScoreType == ScoreType.STRIKE) {
        interimScores[currentFrameIndex - 1] += separateScores[0] + separateScores[1];
      }
      if (currentFrameScore.contains(SPARE)) {
        if (prevScoreType == ScoreType.STRIKE && currentFrameIndex >= 2 && frameScores[currentFrameIndex - 2]
            .contains(STRIKE)) {
          interimScores[currentFrameIndex - 2] += separateScores[0];
        }
        prevScoreType = ScoreType.SPARE;
        interimScores[currentFrameIndex] += 10;

      } else if (currentFrameScore.contains(STRIKE)) {
        if (prevScoreType == ScoreType.STRIKE && currentFrameIndex >= 2 && frameScores[currentFrameIndex - 2]
            .contains(STRIKE)) {
          interimScores[currentFrameIndex - 2] += 10;
        }
        interimScores[currentFrameIndex] += 10;
        prevScoreType = ScoreType.STRIKE;

      } else {
        interimScores[currentFrameIndex] = separateScores[0] + separateScores[1];
        prevScoreType = ScoreType.OPEN;
      }
    }
    calculateLastFrameScore(frameScores, prevScoreType);
    return Arrays.stream(interimScores).sum();
  }

  private ScoreType getScoreTypeForFrame(String frameScore) {
    if (frameScore.contains(STRIKE)) {
      return ScoreType.STRIKE;
    } else if (frameScore.contains(SPARE)) {
      return ScoreType.SPARE;
    } else {
      return ScoreType.OPEN;
    }
  }

  private void calculateLastFrameScore(final String[] frameScores, ScoreType prevScoreType) {
    int i = NUMBER_OF_FRAMES_PER_GAME - 1;
    String currentFrameScore = frameScores[i];
    int[] separateScores = getSeparateRollScores(currentFrameScore);

    if (prevScoreType == ScoreType.SPARE) {
      interimScores[i - 1] += separateScores[0];
      if (getScoreTypeForFrame(currentFrameScore) == ScoreType.STRIKE) {
        interimScores[i - 1] += 10;
      }
    }
    if (prevScoreType == ScoreType.STRIKE) {
      interimScores[i - 1] += separateScores[0] + separateScores[1];
    }

    if (getScoreTypeForFrame(currentFrameScore) == ScoreType.SPARE) {
      if (prevScoreType == ScoreType.STRIKE && getScoreTypeForFrame(frameScores[i - 2]) == ScoreType.STRIKE) {
        interimScores[i - 2] += separateScores[0];
      }
      interimScores[i] += 10 + Integer.parseInt(currentFrameScore.substring(currentFrameScore.indexOf(SPARE) + 1));
    } else if (getScoreTypeForFrame(currentFrameScore) == ScoreType.STRIKE) {
      interimScores[i] += 10;
      separateScores = getSeparateRollScores(frameScores[i + 1]);
      if (prevScoreType == ScoreType.STRIKE && getScoreTypeForFrame(frameScores[i - 2]) == ScoreType.STRIKE) {
        interimScores[i - 2] += 10;
      }
      if (getScoreTypeForFrame(frameScores[i + 1]) == ScoreType.STRIKE) {
        separateScores = getSeparateRollScores(frameScores[i + 2]);
        if (getScoreTypeForFrame(frameScores[i + 2]) == ScoreType.STRIKE) {
          separateScores = getSeparateRollScores(frameScores[i + 1]);
        }
        interimScores[i] += 20 + separateScores[0] + separateScores[1];
      } else if (getScoreTypeForFrame(frameScores[i + 1]) == ScoreType.SPARE) {
        interimScores[i] += 10 + separateScores[0];
      } else {
        interimScores[i] += 2 * separateScores[0] + separateScores[1];
      }
    } else {
      interimScores[i] = separateScores[0] + separateScores[1];
    }
  }

  private int[] getSeparateRollScores(final String frameScore) {
    int[] separateRollScores = new int[2];
    final String formattedScore = frameScore.replace(MISS, "0");
    separateRollScores[0] =
        getScoreTypeForFrame(formattedScore) == ScoreType.STRIKE ? 0 : Integer.parseInt(formattedScore.substring(0, 1));
    if (getScoreTypeForFrame(formattedScore) == ScoreType.STRIKE) {
      separateRollScores[1] = 10;
    } else if (getScoreTypeForFrame(formattedScore) == ScoreType.SPARE) {
      separateRollScores[1] = 10 - separateRollScores[0];
    } else {
      separateRollScores[1] = Integer.parseInt(formattedScore.substring(1, 2));
    }
    return separateRollScores;
  }

  /**
   * An enum that represents possible types of scores for each frame
   */
  enum ScoreType {
    STRIKE,
    SPARE,
    OPEN
  }
}

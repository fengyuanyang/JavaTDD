package com.ordestiny.tdd.algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TernarySearchTest {
    private final TernarySearch underTest = new TernarySearch();

    @Test
    public void shouldReturnIndexWhenLowerThird() {
        assertThat(underTest.search(new int[]{1,2,3,4,5,6,7,8,9,10}, 4)).isEqualTo(3);
    }

    @Test
    public void shouldReturnIndexWhenUpperThird() {
        assertThat(underTest.search(new int[]{1,2,3,4,5,6,7,8,9,10}, 7)).isEqualTo(6);
    }

    @Test
    public void shouldReturnIndexUpper() {
        assertThat(underTest.search(new int[]{1,2,3,4,5,6,7,8,9,10}, 8)).isEqualTo(7);
    }

    @Test
    public void shouldReturnIndexLower() {
        assertThat(underTest.search(new int[]{1,2,3,4,5,6,7,8,9,10}, 1)).isEqualTo(0);
    }

    @Test
    public void shouldReturnIndexBetween() {
        assertThat(underTest.search(new int[]{1,2,3,4,5,6,7,8,9,10}, 5)).isEqualTo(4);
    }

    @Test
    public void shouldReturnMinusOneWhenNoMatch() {
        assertThat(underTest.search(new int[]{1,2,3,4,5,6,7,8,9,10}, 11)).isEqualTo(-1);
    }

    @Test
    public void shouldThrowExceptionWhenNotSorted() {
        assertThatThrownBy(() -> underTest.search(new int[]{10, 9}, 11))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }


}
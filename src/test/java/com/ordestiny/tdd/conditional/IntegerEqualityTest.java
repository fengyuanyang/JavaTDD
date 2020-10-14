package com.ordestiny.tdd.conditional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerEqualityTest {

    private final Integer twenty = 20;
    private final Integer eleven = 11;
    private final Integer ten = 10;
    private final Integer nine = 9;


    @Test
    public void isEqual_WhenIsEqual_ShouldReturnsTrue() {

        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.isEqual(ten, ten);

        // assert
        Assertions.assertThat(is).isTrue();
    }

    @Test
    public void isEqual_WhenIsNotEqual_ShouldReturnsFalse() {

        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.isEqual(ten, nine);

        // assert
        Assertions.assertThat(is).isFalse();
    }

    @Test
    public void isNotEqual_WhenIsNotEqual_ShouldReturnsTrue() {
        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.isNotEqual(ten, nine);

        // assert
        Assertions.assertThat(is).isTrue();
    }

    @Test
    public void isNotEqual_WhenIsEqual_ShouldReturnsFalse() {
        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.isNotEqual(ten, ten);

        // assert
        Assertions.assertThat(is).isFalse();
    }


    @Test
    public void firstIsLessThanSecond_WhenAreLessThan_ShouldReturnsTrue() {

        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.firstIsLessThanSecond(nine, ten);

        // assert
        Assertions.assertThat(is).isTrue();
    }

    @Test
    public void firstIsLessThanSecond_WhenAreNotLessThan_ShouldReturnsFalse() {

        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.firstIsLessThanSecond(ten, nine);

        // assert
        Assertions.assertThat(is).isFalse();
    }

    @Test
    public void firstIsMoreThanSecond_WhenAreMoreThan_ShouldReturnsTrue() {

        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.firstIsMoreThanSecond(twenty, eleven);

        // assert
        Assertions.assertThat(is).isTrue();
    }

    @Test
    public void firstIsMoreThanSecond_WhenAreNotMoreThan_ShouldReturnsFalse() {

        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.firstIsMoreThanSecond(eleven, twenty);

        // assert
        Assertions.assertThat(is).isFalse();
    }

    @Test
    public void firstIsLessThanOrEqualToSecond_whenAreEquals_ShouldReturnsTrue() {
        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.firstIsLessThanOrEqualToSecond(ten, ten);

        Assertions.assertThat(is).isTrue();
    }

    @Test
    public void firstIsLessThanOrEqualToSecond_whenAreLessThan_ShouldReturnsTrue() {
        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.firstIsLessThanOrEqualToSecond(ten, twenty);

        // assert
        Assertions.assertThat(is).isTrue();
    }

    @Test
    public void firstIsLessThanOrEqualToSecond_whenAreNotEqualsAndMoreThan_ShouldReturnsFalse() {

        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.firstIsLessThanOrEqualToSecond(twenty, ten);

        // assert
        Assertions.assertThat(is).isFalse();

    }

    @Test
    public void firstIsMoreThanOrEqualToSecond_whenAreEquals_ShouldReturnsTrue() {
        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.firstIsMoreThanOrEqualToSecond(ten, ten);

        Assertions.assertThat(is).isTrue();
    }

    @Test
    public void firstIsMoreThanOrEqualToSecond_whenAreLessThan_ShouldReturnsFalse() {
        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.firstIsMoreThanOrEqualToSecond(ten, twenty);

        // assert
        Assertions.assertThat(is).isFalse();
    }

    @Test
    public void firstIsMoreThanOrEqualToSecond_whenAreNotEqualsAndLessThan_ShouldReturnsFalse() {

        // arrange
        IntegerEquality equality = new IntegerEquality();

        // act
        boolean is = equality.firstIsMoreThanOrEqualToSecond(ten, twenty);

        // assert
        Assertions.assertThat(is).isFalse();
    }

}

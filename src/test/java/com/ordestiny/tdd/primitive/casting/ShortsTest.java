package com.ordestiny.tdd.primitive.casting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortsTest {

    @Test
    public void from_receivingAByte_ShouldReturnAShort() {
        byte nineAsByte = 9;
        short nineAsShort = Shorts.from(nineAsByte);
        Assertions.assertThat(nineAsShort).isInstanceOf(java.lang.Short.class);
    }

    @Test
    public void from_receivingAChar_ShouldReturnAShort() {
        char aChar = 'a';
        short aShort = Shorts.from(aChar);
        Assertions.assertThat(aShort).isInstanceOf(java.lang.Short.class);
    }

    @Test
    public void from_receivingAnIllegalChar_ShouldThrowsAnIllegalArgumentException() {

        char positive = 32999;
        Assertions.assertThatThrownBy(() -> Shorts.from(positive)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void from_receivingAnInt_ShouldReturnAShort() {
        int ninety = 90;
        short ninetyAShort = Shorts.from(ninety);
        Assertions.assertThat(ninetyAShort).isInstanceOf(java.lang.Short.class);
    }

    @Test
    public void from_receivingAnIllegalInt_ShouldThrowsAnIllegalArgumentException() {

        int positive = 3203302;
        int negative = -3203302;

        Assertions.assertThatThrownBy(() -> Shorts.from(positive)).isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> Shorts.from(negative)).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    public void from_receivingALong_ShouldReturnAShort() {
        long hundred = 100;
        short hundredAsShort = Shorts.from(hundred);
        Assertions.assertThat(hundredAsShort).isInstanceOf(java.lang.Short.class);
    }

    @Test
    public void from_receivingAnIllegalLong_ShouldThrowsAnIllegalArgumentException() {

        long positive = 321321321321L;
        long negative = -213232132131L;

        Assertions.assertThatThrownBy(() -> Shorts.from(positive)).isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> Shorts.from(negative)).isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    public void from_receivingAFloat_ShouldReturnAShort() {
        float fifty = 50;
        short fiftyAsShort = Shorts.from(fifty);
        Assertions.assertThat(fiftyAsShort).isInstanceOf(java.lang.Short.class);
    }

    @Test
    public void from_receivingAnIllegalFloat_ShouldReturnAFloat() {

        float number = 123221.02f;
        float otherNumber = -129334.34f;

        Assertions.assertThatThrownBy(() -> Shorts.from(number)).isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> Shorts.from(otherNumber)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void from_receivingADouble_ShouldReturnADouble() {
        double seventy = 70.0;
        short seventyAsShort = Shorts.from(seventy);
        Assertions.assertThat(seventyAsShort).isInstanceOf(java.lang.Short.class);
    }

    @Test
    public void from_receivingAIllegalDouble_ShouldThrowsAnIllegalArgumentException() {

        double number = 13321321.0;
        double otherNumber = 1232329.93;
        Assertions.assertThatThrownBy(() -> Shorts.from(number)).isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> Shorts.from(otherNumber)).isInstanceOf(IllegalArgumentException.class);
    }
}

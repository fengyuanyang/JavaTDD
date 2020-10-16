package leapYear;

import org.junit.jupiter.api.Test;

import static leapYear.LeapYear.isLeapYear;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void is2000ALeapYear() {
        assertTrue(isLeapYear(2000));
    }

    @Test
    void is1900NotLeapYear() {
        assertFalse(isLeapYear(1900));
    }
}

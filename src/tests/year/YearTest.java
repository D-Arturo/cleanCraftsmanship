package tests.year;

import main.year.Year;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {

    @Test
    public void shouldReturnFalse_WhenYearNotDivisiblebyFour() throws Exception {
        assertFalse(Year.isLeapYear(1997));
    }

    @Test
    public void shouldReturnTrue_WhenYearDivisiblebyFour() throws Exception {
        assertTrue(Year.isLeapYear(1996));
    }

    @Test
    public void shouldReturnTrue_WhenYearDivisiblebyFourHundred() throws Exception {
        assertTrue(Year.isLeapYear(1600));
    }

    @Test
    public void shouldReturnFalse_WhenYearNotDivisiblebyFourHundred() throws Exception {
        assertFalse(Year.isLeapYear(1800));
    }

}

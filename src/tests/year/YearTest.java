package tests.year;

import main.year.Year;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearTest {

    @Test
    public void shouldReturnFalse_WhenYearNotDivisiblebyFour() throws Exception {
        Year year = new Year();
        assertEquals(false, Year.isLeapYear(1997));
    }

    @Test
    public void shouldReturnTrue_WhenYearDivisiblebyFour() throws Exception {
        Year year = new Year();
        assertEquals(true, Year.isLeapYear(1996));
    }

    @Test
    public void shouldReturnTrue_WhenYearDivisiblebyFourHundred() throws Exception {
        Year year = new Year();
        assertEquals(true, Year.isLeapYear(1600));
    }

}

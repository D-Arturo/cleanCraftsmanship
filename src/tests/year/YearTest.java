package tests.year;

import main.year.Year;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearTest {

    @Test
    public void shouldReturnFalse_WhenYearNotDivisiblebyFour() throws Exception {
        Year year = new Year();
        assertEquals(false, Year.isLeapYear(1));
    }

}

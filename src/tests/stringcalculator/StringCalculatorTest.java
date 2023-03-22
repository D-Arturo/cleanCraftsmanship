package tests.stringcalculator;

import main.stringcalculator.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZero_whenEmptyStringPassed() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void shouldReturnFour_whenFourStringPassed() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(4, calculator.add("4"));
    }
}

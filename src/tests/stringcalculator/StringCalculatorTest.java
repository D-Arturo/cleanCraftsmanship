package tests.stringcalculator;

import main.stringcalculator.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    private final StringCalculator calculator = new StringCalculator();

    @Test
    public void shouldReturnZero_whenEmptyStringReceived() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void shouldReturnFour_whenFourStringReceived() {
        assertEquals(4, calculator.add("4"));
    }

    @Test
    public void shouldReturnThree_whenOneCommaTwoStringReceived() {
        assertEquals(4, calculator.add("1,2"));
    }
}

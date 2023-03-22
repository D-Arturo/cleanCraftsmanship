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
    public void shouldReturnTheNumberReceived_whenSingleNumberStringReceived() {
        assertEquals(5, calculator.add("5"));
        assertEquals(6, calculator.add("6"));
        assertEquals(7, calculator.add("7"));
    }

    @Test
    public void shouldReturnTheSUm_whenCommaSeparatedNumberStringReceived() {
        assertEquals(3, calculator.add("1,2"));
        assertEquals(15, calculator.add("6,9"));
        assertEquals(25, calculator.add("16,9"));
        assertEquals(45, calculator.add("1,2,3,4,5,6,7,8,9"));
    }

    @Test
    public void shouldReturnTheSUm_whenStringReceivedUsesCommaOrNewLineSeparator() {
        assertEquals(6, calculator.add("1\n2,3"));
    }
}

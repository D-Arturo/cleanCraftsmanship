package tests.calculator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static main.calculator.Calculator.primeFactorsOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void ShouldReturnPrimeFactors_WhenNumberReceived() throws Exception {
        assertEquals(new ArrayList<>(), primeFactorsOf(1));
        assertEquals(new ArrayList<>(List.of(2)), primeFactorsOf(2));
        assertEquals(new ArrayList<>(List.of(3)), primeFactorsOf(3));
        assertEquals(new ArrayList<>(List.of(2, 2)), primeFactorsOf(4));
        assertEquals(new ArrayList<>(List.of(5)), primeFactorsOf(5));
        assertEquals(new ArrayList<>(List.of(2, 3)), primeFactorsOf(6));
    }
}

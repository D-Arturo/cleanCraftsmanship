package tests.codurance;

import main.codurance.Rover;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoverShould {

    private Rover rover;

    @BeforeEach
    public void setUp() {
        rover = new Rover();
    }

    @ParameterizedTest
    @CsvSource({
            "R, 0:0:E",
            "RR, 0:0:S"
    })
    public void rotate_right(String instructions, String expectedPosition) {
        assertEquals(expectedPosition, rover.execute(instructions));
    }

    @Test
    public void rotate_right_two_times() {
        assertEquals("0:0:S", rover.execute("RR"));
    }

    @Test
    public void rotate_right_three_times() {
        assertEquals("0:0:W", rover.execute("RRR"));
    }

    @Test
    public void rotate_right_four_times() {
        assertEquals("0:0:N", rover.execute("RRRR"));
    }

    @ParameterizedTest
    @CsvSource({
            "L, 0:0:W",
            "LL, 0:0:S",
            "LLL, 0:0:E",
            "LLLL, 0:0:N"
    })
    public void rotate_left(String instructions, String expectedPosition) {
        assertEquals(expectedPosition, rover.execute(instructions));
    }

    @ParameterizedTest
    @CsvSource({
            "M, 0:1:N",
            "MMMM, 0:4:N",
            "MMMMMMMMMMM, 0:1:N"
    })
    public void move_up(String instructions, String expectedPosition) {
        assertEquals(expectedPosition, rover.execute(instructions));
    }

    @ParameterizedTest
    @CsvSource({
            "RM, 1:0:E"
    })
    public void move_right(String instructions, String expectedPosition) {
        assertEquals(expectedPosition, rover.execute(instructions));
    }
}

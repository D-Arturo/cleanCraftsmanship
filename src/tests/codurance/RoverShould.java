package tests.codurance;

import main.codurance.Rover;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RoverShould {

    private Rover rover;

    @BeforeEach
    public void setUp() {
        rover = new Rover();
    }

    @Test
    public void rotate_right() {
        assertEquals("0:0:E", rover.execute("R"));
    }

    @Test
    public void rotate_right_two_times() {
        assertEquals("0:0:S", rover.execute("RR"));
    }
}

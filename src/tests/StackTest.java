package tests;

import org.junit.jupiter.api.Test;
import stack.Stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    @Test
    public void canCreateSTack() throws Exception {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }
}

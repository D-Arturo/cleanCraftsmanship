package tests;

import org.junit.jupiter.api.Test;
import stack.Stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    @Test
    public void canCreateSTack() throws Exception {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void canPush() throws Exception {
        Stack stack = new Stack();
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}

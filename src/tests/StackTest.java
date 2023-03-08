package tests;

import org.junit.jupiter.api.Test;
import stack.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    public static final int EXPECTED_SIZE_TWO = 2;
    private final Stack stack = new Stack();

    @Test
    public void canCreateSTack() throws Exception {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_isNotEmpty() throws Exception {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterOnePushAndOnePop_isEmpty() throws Exception {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterTwoPushes_sizeIsTwo() throws Exception {
        stack.push(1);
        stack.push(2);
        assertEquals(EXPECTED_SIZE_TWO, stack.size());
    }
}

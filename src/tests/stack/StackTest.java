package tests.stack;

import org.junit.jupiter.api.Test;
import stack.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    public static final int EXPECTED_SIZE_TWO = 2;
    public static final int EXPECTED_SIZE_ONE = 1;
    public static final int FIRST_ELEMENT = 1;
    public static final int SECOND_ELEMENT = 5;
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

    @Test
    public void afterTwoPushesAndOnePop_sizeIsOneAndIsNotEmpty() throws Exception {
        stack.push(1);
        stack.push(2);
        stack.pop();
        assertEquals(EXPECTED_SIZE_ONE, stack.size());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void poppingEmptyStack_throwsUnderflowException() throws Exception {
        assertThrows(Stack.Underflow.class, () -> stack.pop());
    }

    @Test
    public void afterPushingNewElement_willPopThatSameElement() throws Exception {
        stack.push(5);
        assertEquals(5, stack.pop());
    }

    @Test
    public void afterPushingTwoElements_willPopLastElement() throws Exception {
        stack.push(1);
        stack.push(5);
        assertEquals(5, stack.pop());
    }

    @Test
    public void afterTwoPushesAndTwoPops_willPopSecondElementPushedThenFirstElement() throws Exception {
        stack.push(FIRST_ELEMENT);
        stack.push(SECOND_ELEMENT);
        assertEquals(SECOND_ELEMENT, stack.pop());
        assertEquals(FIRST_ELEMENT, stack.pop());
    }

    @Test
    public void pushingThreeTimes_throwsOverflowException() throws Exception {
        assertThrows(Stack.Overflow.class, () -> {
            stack.push(1);
            stack.push(2);
            stack.push(3);
        });
    }
}

package medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    void testPushPopTopGetMin() {
        MinStack stack = new MinStack();
        stack.push(3);
        assertEquals(3, stack.top());
        assertEquals(3, stack.getMin());

        stack.push(5);
        assertEquals(5, stack.top());
        assertEquals(3, stack.getMin());

        stack.push(2);
        assertEquals(2, stack.top());
        assertEquals(2, stack.getMin());

        stack.pop();
        assertEquals(5, stack.top());
        assertEquals(3, stack.getMin());

        stack.pop();
        assertEquals(3, stack.top());
        assertEquals(3, stack.getMin());
    }

    @Test
    void testPushDecreasingOrder() {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        assertEquals(1, stack.getMin());
        stack.pop();
        assertEquals(2, stack.getMin());
        stack.pop();
        assertEquals(3, stack.getMin());
    }

    @Test
    void testPushSameValues() {
        MinStack stack = new MinStack();
        stack.push(2);
        stack.push(2);
        stack.push(2);
        assertEquals(2, stack.getMin());
        stack.pop();
        assertEquals(2, stack.getMin());
        stack.pop();
        assertEquals(2, stack.getMin());
    }

    @Test
    void testSingleElement() {
        MinStack stack = new MinStack();
        stack.push(42);
        assertEquals(42, stack.top());
        assertEquals(42, stack.getMin());
        stack.pop();
        // No elements left; further calls would throw exceptions
    }
}
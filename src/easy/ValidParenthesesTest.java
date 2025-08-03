package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void testValidParentheses() {
        assertTrue(new ValidParentheses().isValid("()"));
        assertTrue(new ValidParentheses().isValid("()[]{}"));
        assertTrue(new ValidParentheses().isValid("{[]}"));
    }

    @Test
    void testInvalidParentheses() {
        assertFalse(new ValidParentheses().isValid("(]"));
        assertFalse(new ValidParentheses().isValid("([)]"));
        assertFalse(new ValidParentheses().isValid("]"));
        assertFalse(new ValidParentheses().isValid("["));
    }

    @Test
    void testEmptyString() {
        assertTrue(new ValidParentheses().isValid(""));
    }

    @Test
    void testSingleCharacter() {
        assertFalse(new ValidParentheses().isValid("("));
        assertFalse(new ValidParentheses().isValid(")"));
        assertFalse(new ValidParentheses().isValid("["));
        assertFalse(new ValidParentheses().isValid("]"));
        assertFalse(new ValidParentheses().isValid("{"));
        assertFalse(new ValidParentheses().isValid("}"));
    }

    @Test
    void testLongValidString() {
        assertTrue(new ValidParentheses().isValid("((({{{[[[]]]}}})))"));
    }

    @Test
    void testLongInvalidString() {
        assertFalse(new ValidParentheses().isValid("((({{{[[[]]]}}}))"));
    }
}
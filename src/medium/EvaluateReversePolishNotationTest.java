package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {
    @Test
    void testSimpleAddition() {
        String[] tokens = {"2", "3", "+"};
        assertEquals(5, EvaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    void testSimpleSubtraction() {
        String[] tokens = {"5", "2", "-"};
        assertEquals(3, EvaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    void testSimpleMultiplication() {
        String[] tokens = {"4", "3", "*"};
        assertEquals(12, EvaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    void testSimpleDivision() {
        String[] tokens = {"8", "2", "/"};
        assertEquals(4, EvaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    void testComplexExpression() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        assertEquals(9, EvaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    void testNegativeNumbers() {
        String[] tokens = {"-2", "3", "*"};
        assertEquals(-6, EvaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    void testSingleNumber() {
        String[] tokens = {"42"};
        assertEquals(42, EvaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    void testEmptyInput() {
        String[] tokens = {};
        assertThrows(Exception.class, () -> EvaluateReversePolishNotation.evalRPN(tokens));
    }
}
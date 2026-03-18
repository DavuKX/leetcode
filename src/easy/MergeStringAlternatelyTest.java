package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringAlternatelyTest {

    private final MergeStringAlternately solution = new MergeStringAlternately();

    @Test
    void testEqualLength() {
        // "abc" + "pqr" -> "apbqcr"
        assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
    }

    @Test
    void testWord1Longer() {
        // "ab" + "pqrs" -> "apbqrs"
        assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));
    }

    @Test
    void testWord2Longer() {
        // "abcd" + "pq" -> "apbqcd"
        assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
    }

    @Test
    void testSingleCharBoth() {
        // "a" + "b" -> "ab"
        assertEquals("ab", solution.mergeAlternately("a", "b"));
    }

    @Test
    void testWord1SingleChar() {
        // "a" + "bcd" -> "abcd"
        assertEquals("abcd", solution.mergeAlternately("a", "bcd"));
    }

    @Test
    void testWord2SingleChar() {
        // "abc" + "d" -> "adbc"
        assertEquals("adbc", solution.mergeAlternately("abc", "d"));
    }

    @Test
    void testBothSingleCharSameLetter() {
        // "z" + "z" -> "zz"
        assertEquals("zz", solution.mergeAlternately("z", "z"));
    }
}

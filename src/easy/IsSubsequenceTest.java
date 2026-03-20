package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    IsSubsequence solution = new IsSubsequence();

    @Test
    void testIsSubsequence_true() {
        assertTrue(solution.isSubsequence("ace", "abcde"));
    }

    @Test
    void testIsSubsequence_false() {
        assertFalse(solution.isSubsequence("aec", "abcde"));
    }

    @Test
    void testIsSubsequence_emptyS() {
        assertTrue(solution.isSubsequence("", "abcde"));
    }

    @Test
    void testIsSubsequence_emptyT() {
        assertFalse(solution.isSubsequence("a", ""));
    }

    @Test
    void testIsSubsequence_bothEmpty() {
        assertTrue(solution.isSubsequence("", ""));
    }

    @Test
    void testIsSubsequence_sameString() {
        assertTrue(solution.isSubsequence("abc", "abc"));
    }

    @Test
    void testIsSubsequence_sLongerThanT() {
        assertFalse(solution.isSubsequence("abcd", "abc"));
    }

    @Test
    void testIsSubsequence_singleCharPresent() {
        assertTrue(solution.isSubsequence("b", "abc"));
    }

    @Test
    void testIsSubsequence_singleCharAbsent() {
        assertFalse(solution.isSubsequence("x", "abc"));
    }

    @Test
    void testIsSubsequence_repeatedChars() {
        assertTrue(solution.isSubsequence("aaa", "aaabbbccc"));
    }

    @Test
    void testIsSubsequence_repeatedCharsNotEnough() {
        assertFalse(solution.isSubsequence("aaaa", "aaa"));
    }

    @Test
    void testIsSubsequence_nonConsecutive() {
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }
}

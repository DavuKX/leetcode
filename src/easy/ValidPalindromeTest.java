package easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    @Test
    void testTypicalPalindrome() {
        assertTrue(ValidPalindrome.isPalindrome("racecar"));
        assertTrue(ValidPalindrome.isPalindrome("madam"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(ValidPalindrome.isPalindrome("hello"));
        assertFalse(ValidPalindrome.isPalindrome("java"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(ValidPalindrome.isPalindrome("a"));
    }

    @Test
    void testEmptyString() {
        assertTrue(ValidPalindrome.isPalindrome(""));
    }

    @Test
    void testEvenLengthPalindrome() {
        assertTrue(ValidPalindrome.isPalindrome("abba"));
    }

    @Test
    void testCaseSensitive() {
        assertTrue(ValidPalindrome.isPalindrome("Racecar"));
    }

    @Test
    void testWithSpaces() {
        assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
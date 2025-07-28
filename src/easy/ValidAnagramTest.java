package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void testValidAnagram_true() {
        assertTrue(ValidAnagram.validAnagram("anagram", "nagaram"));
    }

    @Test
    void testValidAnagram_false() {
        assertFalse(ValidAnagram.validAnagram("rat", "car"));
    }

    @Test
    void testValidAnagram_emptyStrings() {
        assertTrue(ValidAnagram.validAnagram("", ""));
    }

    @Test
    void testValidAnagram_differentLengths() {
        assertFalse(ValidAnagram.validAnagram("a", "ab"));
    }

    @Test
    void testValidAnagram_singleChar_true() {
        assertTrue(ValidAnagram.validAnagram("a", "a"));
    }

    @Test
    void testValidAnagram_singleChar_false() {
        assertFalse(ValidAnagram.validAnagram("a", "b"));
    }
}
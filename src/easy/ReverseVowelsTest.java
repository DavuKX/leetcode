package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsTest {

    private final ReverseVowels reverseVowels = new ReverseVowels();

    @Test
    void testReverseVowels_basic() {
        assertEquals("AceCreIm", reverseVowels.reverseVowels("IceCreAm"));
    }

    @Test
    void testReverseVowels_hello() {
        assertEquals("holle", reverseVowels.reverseVowels("hello"));
    }

    @Test
    void testReverseVowels_noVowels() {
        assertEquals("bcdfg", reverseVowels.reverseVowels("bcdfg"));
    }

    @Test
    void testReverseVowels_allVowels() {
        assertEquals("uoiea", reverseVowels.reverseVowels("aeiou"));
    }

    @Test
    void testReverseVowels_singleVowel() {
        assertEquals("bAc", reverseVowels.reverseVowels("bAc"));
    }

    @Test
    void testReverseVowels_emptyString() {
        assertEquals("", reverseVowels.reverseVowels(""));
    }

    @Test
    void testReverseVowels_singleCharacter() {
        assertEquals("a", reverseVowels.reverseVowels("a"));
    }

    @Test
    void testReverseVowels_uppercaseVowels() {
        assertEquals("UBA", reverseVowels.reverseVowels("ABU"));
    }

    @Test
    void testReverseVowels_mixedCase() {
        assertEquals("EaI", reverseVowels.reverseVowels("IaE"));
    }

    @Test
    void testIsABowel_lowercaseVowel() {
        assertTrue(reverseVowels.isABowel('a'));
        assertTrue(reverseVowels.isABowel('e'));
        assertTrue(reverseVowels.isABowel('i'));
        assertTrue(reverseVowels.isABowel('o'));
        assertTrue(reverseVowels.isABowel('u'));
    }

    @Test
    void testIsABowel_uppercaseVowel() {
        assertTrue(reverseVowels.isABowel('A'));
        assertTrue(reverseVowels.isABowel('E'));
        assertTrue(reverseVowels.isABowel('I'));
        assertTrue(reverseVowels.isABowel('O'));
        assertTrue(reverseVowels.isABowel('U'));
    }

    @Test
    void testIsABowel_consonants() {
        assertFalse(reverseVowels.isABowel('b'));
        assertFalse(reverseVowels.isABowel('c'));
        assertFalse(reverseVowels.isABowel('d'));
        assertFalse(reverseVowels.isABowel('B'));
        assertFalse(reverseVowels.isABowel('C'));
    }
}

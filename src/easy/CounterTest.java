package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void testCount_returnsMostFrequentCharacter() {
        Counter counter = new Counter();
        Character result = counter.count("hello");
        assertEquals('l', result);
    }

    @Test
    void testCount_returnsMostFrequentCharacterWithClearWinner() {
        Counter counter = new Counter();
        Character result = counter.count("banana");
        assertEquals('a', result);
    }

    @Test
    void testCount_emptyString_returnsNull() {
        Counter counter = new Counter();
        Character result = counter.count("");
        assertNull(result);
    }

    @Test
    void testCount_singleCharacter() {
        Counter counter = new Counter();
        Character result = counter.count("z");
        assertEquals('z', result);
    }

    @Test
    void testCount_allSameCharacters() {
        Counter counter = new Counter();
        Character result = counter.count("bbbb");
        assertEquals('b', result);
    }

    @Test
    void testCount_tie_returnsOneOfTheMostFrequent() {
        Counter counter = new Counter();
        Character result = counter.count("aabb");
        assertNotNull(result);
        assertTrue(result == 'a' || result == 'b');
    }
}

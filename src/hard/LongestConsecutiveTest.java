package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveTest {

    @Test
    void longestConsecutive() {
        int[] test = new int[]{100, 4, 200, 1, 3, 2};

        assertEquals(4, LongestConsecutive.longestConsecutive(test));
    }

    @Test
    void longestConsecutive2() {
        int[] test = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        assertEquals(9, LongestConsecutive.longestConsecutive(test));
    }

    @Test
    void longestConsecutive3() {
        int[] test = new int[]{1, 0, 1, 2};

        assertEquals(3, LongestConsecutive.longestConsecutive(test));
    }
}
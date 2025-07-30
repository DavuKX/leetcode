package medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumIITest {

    @Test
    void testTypicalCase() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSumII.twoSum(numbers, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testNoSolution() {
        int[] numbers = {1, 2, 3, 4};
        int target = 10;
        int[] result = TwoSumII.twoSum(numbers, target);
        assertNull(result);
    }

    @Test
    void testWithNegativeNumbers() {
        int[] numbers = {-3, 0, 3, 4};
        int target = 0;
        int[] result = TwoSumII.twoSum(numbers, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    void testSinglePairAtEnd() {
        int[] numbers = {1, 2, 3, 4, 6};
        int target = 10;
        int[] result = TwoSumII.twoSum(numbers, target);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new int[]{4, 5}, result);
    }

    @Test
    void testEmptyArray() {
        int[] numbers = {};
        int target = 0;
        int[] result = TwoSumII.twoSum(numbers, target);
        assertNull(result);
    }
}
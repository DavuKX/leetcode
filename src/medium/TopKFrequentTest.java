package medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class TopKFrequentTest {

    @Test
    void testTypicalCase() {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = TopKFrequent.topKFrequent(nums, k);
        Arrays.sort(result);
        int[] expected = {1,2};
        Arrays.sort(expected);
        assertArrayEquals(expected, result);
    }

    @Test
    void testAllUnique() {
        int[] nums = {1,2,3,4};
        int k = 2;
        int[] result = TopKFrequent.topKFrequent(nums, k);
        assertEquals(2, result.length);
        for (int num : result) {
            assertTrue(Arrays.asList(1,2,3,4).contains(num));
        }
    }

    @Test
    void testKEqualsArrayLength() {
        int[] nums = {4,4,6,6,7,7};
        int k = 3;
        int[] result = TopKFrequent.topKFrequent(nums, k);
        Arrays.sort(result);
        int[] expected = {4,6,7};
        Arrays.sort(expected);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSingleElement() {
        int[] nums = {5};
        int k = 1;
        int[] result = TopKFrequent.topKFrequent(nums, k);
        assertArrayEquals(new int[]{5}, result);
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int k = 0;
        int[] result = TopKFrequent.topKFrequent(nums, k);
        assertArrayEquals(new int[]{}, result);
    }
}
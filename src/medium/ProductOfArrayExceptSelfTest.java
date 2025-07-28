package medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void testTypicalCase() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testWithZero() {
        int[] nums = {1, 2, 0, 4};
        int[] expected = {0, 0, 8, 0};
        assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testWithMultipleZeros() {
        int[] nums = {0, 2, 0, 4};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testSingleElement() {
        int[] nums = {5};
        int[] expected = {1};
        assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testTwoElements() {
        int[] nums = {3, 4};
        int[] expected = {4, 3};
        assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, 2, -3, 4};
        int[] expected = {-24, 12, -8, 6};
        assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(nums));
    }
}
package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void testTypicalCase() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        assertEquals(expected, TrappingRainWater.trap(height));
    }

    @Test
    void testNoTrapping() {
        int[] height = {1, 2, 3, 4, 5};
        int expected = 0;
        assertEquals(expected, TrappingRainWater.trap(height));
    }

    @Test
    void testAllSameHeight() {
        int[] height = {2, 2, 2, 2};
        int expected = 0;
        assertEquals(expected, TrappingRainWater.trap(height));
    }

    @Test
    void testSingleElement() {
        int[] height = {4};
        int expected = 0;
        assertEquals(expected, TrappingRainWater.trap(height));
    }

    @Test
    void testEmptyArray() {
        int[] height = {};
        int expected = 0;
        assertEquals(expected, TrappingRainWater.trap(height));
    }

    @Test
    void testTwoElements() {
        int[] height = {2, 1};
        int expected = 0;
        assertEquals(expected, TrappingRainWater.trap(height));
    }

    @Test
    void testValley() {
        int[] height = {3, 0, 2, 0, 4};
        int expected = 7;
        assertEquals(expected, TrappingRainWater.trap(height));
    }
}
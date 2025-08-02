
package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void testTypicalCase() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        assertEquals(expected, new ContainerWithMostWater().maxArea(height));
    }

    @Test
    void testTwoElements() {
        int[] height = {1, 1};
        int expected = 1;
        assertEquals(expected, new ContainerWithMostWater().maxArea(height));
    }

    @Test
    void testIncreasingHeights() {
        int[] height = {1, 2, 3, 4, 5};
        int expected = 6;
        assertEquals(expected, new ContainerWithMostWater().maxArea(height));
    }

    @Test
    void testDecreasingHeights() {
        int[] height = {5, 4, 3, 2, 1};
        int expected = 6;
        assertEquals(expected, new ContainerWithMostWater().maxArea(height));
    }

    @Test
    void testAllSameHeight() {
        int[] height = {3, 3, 3, 3, 3};
        int expected = 12;
        assertEquals(expected, new ContainerWithMostWater().maxArea(height));
    }

    @Test
    void testSingleElement() {
        int[] height = {5};
        int expected = 0;
        assertEquals(expected, new ContainerWithMostWater().maxArea(height));
    }

    @Test
    void testEmptyArray() {
        int[] height = {};
        int expected = 0;
        assertEquals(expected, new ContainerWithMostWater().maxArea(height));
    }
}
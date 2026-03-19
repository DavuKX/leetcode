package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    void testCanPlaceFlowers_example1() {
        // flowerbed = [1,0,0,0,1], n = 1 -> true
        int[] flowerbed = {1, 0, 0, 0, 1};
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    void testCanPlaceFlowers_example2() {
        // flowerbed = [1,0,0,0,1], n = 2 -> false
        int[] flowerbed = {1, 0, 0, 0, 1};
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, 2));
    }

    @Test
    void testCanPlaceFlowers_zeroFlowers() {
        // n = 0 should always return true
        int[] flowerbed = {1, 0, 1};
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, 0));
    }

    @Test
    void testCanPlaceFlowers_allEmpty() {
        // flowerbed = [0,0,0,0,0], n = 3 -> true (can place at indices 0, 2, 4)
        int[] flowerbed = {0, 0, 0, 0, 0};
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, 3));
    }

    @Test
    void testCanPlaceFlowers_allEmptyExceedsCapacity() {
        // flowerbed = [0,0,0,0,0], n = 4 -> false (max 3 can be placed)
        int[] flowerbed = {0, 0, 0, 0, 0};
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, 4));
    }

    @Test
    void testCanPlaceFlowers_singleEmptyPlot() {
        // flowerbed = [0], n = 1 -> true
        int[] flowerbed = {0};
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    void testCanPlaceFlowers_singleOccupiedPlot() {
        // flowerbed = [1], n = 1 -> false
        int[] flowerbed = {1};
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    void testCanPlaceFlowers_noConsecutiveEmpties() {
        // flowerbed = [1,0,1,0,1], n = 1 -> false (no room to plant)
        int[] flowerbed = {1, 0, 1, 0, 1};
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    void testCanPlaceFlowers_edgeEmptyOnBothSides() {
        // flowerbed = [0,1,0,0,0,1,0], n = 2 -> false (only 1 spot available at each end)
        int[] flowerbed = {0, 1, 0, 0, 0, 1, 0};
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, 2));
    }

    @Test
    void testCanPlaceFlowers_largeGapInMiddle() {
        // flowerbed = [1,0,0,0,0,0,1], n = 2 -> true (can place at indices 2 and 4)
        int[] flowerbed = {1, 0, 0, 0, 0, 0, 1};
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, 2));
    }
}

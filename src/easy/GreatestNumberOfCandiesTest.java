package easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreatestNumberOfCandiesTest {

    @Test
    void testKidsWithCandies_example1() {
        // candies = [2,3,5,1,3], extraCandies = 3
        // max is 5; after extra: [5,6,8,4,6] -> [true,true,true,false,true]
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = GreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(Arrays.asList(true, true, true, false, true), result);
    }

    @Test
    void testKidsWithCandies_example2() {
        // candies = [4,2,1,1,2], extraCandies = 1
        // max is 4; after extra: [5,3,2,2,3] -> [true,false,false,false,false]
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> result = GreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(Arrays.asList(true, false, false, false, false), result);
    }

    @Test
    void testKidsWithCandies_example3() {
        // candies = [12,1,12], extraCandies = 10
        // max is 12; after extra: [22,11,22] -> [true,false,true]
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> result = GreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(Arrays.asList(true, false, true), result);
    }

    @Test
    void testKidsWithCandies_allEqual() {
        // All kids have the same candies; every kid becomes greatest after extra
        int[] candies = {5, 5, 5};
        int extraCandies = 2;
        List<Boolean> result = GreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(Arrays.asList(true, true, true), result);
    }

    @Test
    void testKidsWithCandies_singleKid() {
        // Only one kid always has the greatest number
        int[] candies = {7};
        int extraCandies = 0;
        List<Boolean> result = GreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(Arrays.asList(true), result);
    }

    @Test
    void testKidsWithCandies_extraCandiesZero() {
        // extraCandies = 0; only kids already at the max qualify
        int[] candies = {3, 1, 4, 1, 5};
        int extraCandies = 0;
        List<Boolean> result = GreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(Arrays.asList(false, false, false, false, true), result);
    }

    @Test
    void testKidsWithCandies_largeExtraCandies() {
        // extraCandies large enough so every kid becomes greatest
        int[] candies = {1, 2, 3};
        int extraCandies = 100;
        List<Boolean> result = GreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(Arrays.asList(true, true, true), result);
    }
}

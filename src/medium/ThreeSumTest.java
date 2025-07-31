package medium;

import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class ThreeSumTest {

    private List<List<Integer>> sortTriplets(List<List<Integer>> triplets) {
        for (List<Integer> triplet : triplets) {
            Collections.sort(triplet);
        }
        triplets.sort((a, b) -> {
            for (int i = 0; i < 3; i++) {
                int cmp = a.get(i).compareTo(b.get(i));
                if (cmp != 0) return cmp;
            }
            return 0;
        });
        return triplets;
    }

    @Test
    public void testTypicalCase() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
//        int[] nums = {-4, -1, -1, 0, 1, 2};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        Assert.assertEquals(sortTriplets(expected), sortTriplets(result));
    }

    @Test
    public void testNoTriplets() {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> expected = Collections.singletonList(Arrays.asList(0, 0, 0));
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testLessThanThreeElements() {
        int[] nums = {0, 1};
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testMultipleTriplets() {
        int[] nums = {-2, 0, 1, 1, 2};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-2, 0, 2),
                Arrays.asList(-2, 1, 1)
        );
        List<List<Integer>> result = ThreeSum.threeSum(nums);
        Assert.assertEquals(sortTriplets(expected), sortTriplets(result));
    }
}
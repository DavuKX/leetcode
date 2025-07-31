package medium;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0 && i != l && i != r) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}

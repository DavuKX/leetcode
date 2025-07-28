package easy;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[]{0, 0};

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], i);

            Integer sub = target - nums[i];

            if (map.get(sub) != null && map.get(sub) != i) {
                result[0] = map.get(sub);
                result[1] = i;

                return result;
            }
        }

        return result;
    }
}

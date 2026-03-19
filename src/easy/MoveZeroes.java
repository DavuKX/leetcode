package easy;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] != 0 && nums[i - 1] == 0) {
                int n = i;
                while (n > 0 && nums[n - 1] == 0) {
                    int y = nums[n];
                    int x = nums[n - 1];
                    nums[n] = x;
                    nums[n - 1] = y;
                    n--;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

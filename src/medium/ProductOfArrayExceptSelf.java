package medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        test();
    }

    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeros = 0;

        for (int num : nums) {
            if (num != 0) {
                product *= num;
            } else {
                zeros++;
            }
        }

        if (zeros > 1) {
            return new int[nums.length];
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (zeros > 0) {
                result[i] = nums[i] == 0 ? product : 0;
            } else {
                result[i] = product / nums[i];
            }
        }

        return result;
    }

    public static void test() {
        int[] nums1 = {1, 2, 3, 4};
        System.out.println(Arrays.equals(productExceptSelf(nums1), new int[]{24, 12, 8, 6}));

        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.equals(productExceptSelf(nums2), new int[]{0, 0, 9, 0, 0}));
    }
}

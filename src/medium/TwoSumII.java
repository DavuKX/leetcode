package medium;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0) {
            return new int[0];
        }
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum == target) {
                return new int[] {l + 1, r + 1};
            }

            if (sum > target) {
                r--;
            } else {
                l++;
            }
        }

        return new int[0];
    }
}

package medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length < 1) {
            return 0;
        }

        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r) {
            int x = Math.min(height[l], height[r]);

            max = Math.max(max, x * (r - l));

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}

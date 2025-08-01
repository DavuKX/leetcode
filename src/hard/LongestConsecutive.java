package hard;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num: set) {
            if (!set.contains(num - 1)) {
                int length = 1;

                while (set.contains(num + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}

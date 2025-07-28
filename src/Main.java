import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        topKFrequentTest();
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[]{0, 0};

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], i);
            }

            Integer sub = target - nums[i];

            if (map.get(sub) != null && map.get(sub) != i) {
                result[0] = map.get(sub);
                result[1] = i;

                return result;
            }
        }
        return result;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                return true;
            }
        }

        return false;
    }

    public static void containsDuplicateTests() {
        System.out.println(containsDuplicate(new int[]{0, 2, 3, 1}) == true);
        System.out.println(containsDuplicate(new int[]{0, 2, 3, 4}) == false);
        System.out.println(containsDuplicate(new int[]{0, 1, 1, 3, 3, 4, 3, 2, 4, 2}) == true);
    }

    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    public static void validAnagramTests() {
        System.out.println(validAnagram("anagram", "nagaram"));
        System.out.println(validAnagram("rat", "car"));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (map.get(sorted) == null) {
                map.put(sorted, new ArrayList<>(List.of(word)));
            } else {
                map.get(sorted).add(word);
            }
        }

        return new ArrayList<>(map.values());
    }

    public static void groupAnagramsTest() {
        List<List<String>> result = new ArrayList<>();
        result.add(new ArrayList<>(List.of("bat")));
        result.add(new ArrayList<>(List.of("nat", "tan")));
        result.add(new ArrayList<>(List.of("ate", "eat", "tea")));
        System.out.println(Objects.equals(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}), result));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }

        return res;
    }

    public static void topKFrequentTest() {
        System.out.println(Arrays.equals(topKFrequent(new int[]{1, 2, 2, 3, 3, 3}, 2), new int[]{3, 2}));
        System.out.println(Arrays.equals(topKFrequent(new int[]{7, 7}, 1), new int[]{7}));
    }
}
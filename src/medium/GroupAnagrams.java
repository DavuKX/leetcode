package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

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
}

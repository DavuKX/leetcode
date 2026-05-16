package easy;

import java.util.LinkedHashMap;

public class Counter {
    public Character count(String name) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int highestFrequency = 0;
        Character highestChar = null;

        for (int i = 0; i < name.length(); i++) {
            if (map.get(name.charAt(i)) == null) {
                map.put(name.charAt(i), 1);
            } else {
                map.put(name.charAt(i), map.get(name.charAt(i)) + 1);
            }


            if (map.get(name.charAt(i)) > highestFrequency) {
                highestFrequency = map.get(name.charAt(i));
                highestChar = name.charAt(i);
            }
        }

        return highestChar;
    }
}

package easy;

import java.util.Stack;

public class ReverseVowels {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (this.isABowel(c)) {
                stack.push(c);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (this.isABowel(chars[i])) {
                chars[i] = stack.pop();
            }
        }

        return new String(chars);
    }

    public Boolean isABowel(char c) {
        return
                Character.toLowerCase(c) == 'a' ||
                Character.toLowerCase(c) == 'e' ||
                Character.toLowerCase(c) == 'i' ||
                Character.toLowerCase(c) == 'o' ||
                Character.toLowerCase(c) == 'u';
    }
}

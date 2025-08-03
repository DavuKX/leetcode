package easy;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
                '}', '{',
                ']', '[',
                ')', '('
        );

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '{' && s.charAt(i) != '(' && s.charAt(i) != '[' && s.charAt(i) != '}' && s.charAt(i) != ')' && s.charAt(i) != ']') {
                return false;
            }

            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && map.get(s.charAt(i)).equals(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }
}

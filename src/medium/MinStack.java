package medium;

import java.util.HashMap;
import java.util.Stack;

public class MinStack {
    private final Stack<Integer> stack;
    private final HashMap<Integer, Integer> map;

    public MinStack() {
        this.stack = new Stack<>();
        this.map = new HashMap<>();
    }

    public void push(int val) {
        map.put(stack.size(), Math.min(val, map.getOrDefault(stack.size() - 1, val)));
        stack.push(val);
    }

    public void pop() {
        map.remove(stack.size() - 1);
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return map.get(stack.size() - 1);
    }
}

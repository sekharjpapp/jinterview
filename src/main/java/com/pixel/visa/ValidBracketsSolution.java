package com.pixel.visa;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidBracketsSolution {
    public static void main(String[] args) {
        String code = """
                public void test() { if (true) { System.out.println(\"hi\"); } }
                """;
        System.out.println(isValid(code));
    }
    public static boolean isValid(String code) {
        if (code == null) return false;
        if (code.isEmpty()) return true;

        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (char c : code.toCharArray()) {
            if (bracketPairs.containsKey(c)) {
                // It's an opening bracket - push to stack
                stack.push(c);
            } else if (bracketPairs.containsValue(c)) {
                // It's a closing bracket - check if it matches the last opener
                if (stack.isEmpty() || bracketPairs.get(stack.pop()) != c) {
                    return false;
                }
            }
            // Ignore other characters (if any)
        }

        // If stack is empty, all brackets were properly closed
        return stack.isEmpty();
    }
}

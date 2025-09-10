package com.pixel.visa;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String code = """
                public void test() { if (true) { System.out.println(\"hi\"); } }
                """;
        System.out.println(isValidJavaMethod(code));
        System.out.println(isValid(code));
    }

    public static boolean isValidJavaMethod(String code) {
        Stack<Character> stack = new Stack<>();

        for (char c : code.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
            // all other characters ignored
        }
        return stack.isEmpty();
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == ')' || c == '}' || c == ']') {
                // Closing bracket without matching opening
                return false;
            }
            // all other characters ignored
        }

        return stack.isEmpty();
    }

}

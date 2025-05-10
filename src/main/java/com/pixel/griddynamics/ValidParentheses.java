package com.pixel.griddynamics;


import java.util.Stack;

// Valid Parentheses  Java Leetcode
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));        // true
        System.out.println(isValid("()[]{}"));    // true
        System.out.println(isValid("(]"));        // false
        System.out.println(isValid("([)]"));      // false
        System.out.println(isValid("{[]}"));      // true
        System.out.println(isValid("[()]{}{[()()]()}"));      // true
        System.out.println(isValid("[(])"));      // false
    }
    public  static boolean isValid(String s) {
        // Strings representing opening and closing brackets
        String opening = "({[";
        String closing = ")}]";
        Stack<Character> st = new Stack<>();

        // Iterate over each character in the string
        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push it to the stack
            if (opening.indexOf(ch) != -1) {
                st.push(ch);
            } else {
                // If the stack is empty, it means we have a closing bracket without an opening
                if (st.isEmpty()) {
                    return false;
                }

                // Pop the top element from the stack
                char tmp = st.pop();

                // Check if the popped element and the current closing bracket match
                if (opening.indexOf(tmp) != closing.indexOf(ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty at the end, all brackets matched; otherwise, return false
        return st.isEmpty();
    }

}

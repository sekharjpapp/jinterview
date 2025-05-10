package com.pixel.griddynamics;

import java.util.Stack;
import java.util.random.RandomGenerator;

public class Java8Solution {
    public static void main(String[] args) {
        String input = "({[]})";
        String input1 = "[()]{}{[()()]()}";
        String input2 = "[(])";
        System.out.println(isValid(input));  // Output: true
        System.out.println(isValid(input1));  // Output: true
        System.out.println(isValid(input1));  // Output: true
        System.out.println(isValid(input2));  // Output: true
        System.out.println(isValidParentheses(input2));
        System.out.println(isValidParentheses(input1));
        RandomGenerator generator = RandomGenerator.of("L128X256MixRandom");
        // Generate a random integer
        int randomInt = generator.nextInt();
        System.out.println("Random Integer: " + randomInt);

// Generate a random double
        double randomDouble = generator.nextDouble();
        System.out.println("Random Double: " + randomDouble);
    }
    public  static  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate through the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // If it's a closing bracket, check if it matches the last opening bracket
            else {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }

        // If the stack is empty, all brackets were matched and closed
        return stack.isEmpty();
    }
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c:s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}

package com.pixel.optum;

public class ReverseStringUsingForLoop {
    public static void main(String[] args) {
        String input = "abcdef";
        String reversed = reverseUsingForLoop(input);
        System.out.println(reversed);  // Output: fedcba
    }

    public static String reverseUsingForLoop(String input) {
        char[] reversedChars = new char[input.length()];

        // Iterate over the string in reverse order
        for (int i = 0; i < input.length(); i++) {
            // Use charAt() to get each character from the original string
            reversedChars[i] = input.charAt(input.length() - 1 - i);
        }

        // Convert the character array back to a string
        return new String(reversedChars);
    }
}

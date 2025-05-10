package com.pixel.twopointer;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  the sky is   blue  ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        // Step 1: Trim the input string to remove leading and trailing spaces
        // Step 2: Split the string by one or more spaces
        String[] words = s.trim().split("\\s+");

        // Step 3: Use StringBuilder to reverse the order of the words
        StringBuilder result = new StringBuilder();

        // Step 4: Iterate the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        // Step 5: Convert StringBuilder to String and return
        return result.toString();
    }
}

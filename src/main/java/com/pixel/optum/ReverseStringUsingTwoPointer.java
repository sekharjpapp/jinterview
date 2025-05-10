package com.pixel.optum;

public class ReverseStringUsingTwoPointer {
    public static void main(String[] args) {
        String input = "abcdef";
        String reversed = reverseUsingTwoPointer(input);
        System.out.println(reversed);  // Output: fedcba
    }
    public static String reverseUsingTwoPointer(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers
            left++;
            right--;
        }
        return new String(chars);
    }
}

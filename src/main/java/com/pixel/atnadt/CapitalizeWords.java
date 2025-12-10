package com.pixel.atnadt;

public class CapitalizeWords {
    public static void main(String[] args) {
        String str = "this was my name here";
        System.out.println(capitalizeWords(str)); // Output: This Was My Name Here
    }
    private static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;

        char[] chars = str.toCharArray();
        int n = chars.length;
        int left = 0;

        while (left < n) {
            // Skip spaces
            while (left < n && chars[left] == ' ') {
                left++;
            }
            // If we found a character, uppercase it
            if (left < n) {
                chars[left] = Character.toUpperCase(chars[left]);
                // Move to the end of current word
                int right = left + 1;
                while (right < n && chars[right] != ' ') {
                    right++;
                }
                // Move left to start of next word
                left = right;
            }
        }
        return new String(chars);
    }
}

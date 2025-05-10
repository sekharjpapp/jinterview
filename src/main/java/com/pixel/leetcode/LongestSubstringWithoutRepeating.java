package com.pixel.leetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);

    }
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // HashMap to store the last seen index of each character
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Start index of the current window

        // Iterate over the characters in the string
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map, update the start index
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Update the last seen index of the current character
            charIndexMap.put(currentChar, end);

            // Calculate the max length of the substring
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}

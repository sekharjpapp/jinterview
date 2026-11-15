package com.pixel.wissentech;

import java.util.HashMap;
import java.util.Map;
/*
* Longest Substring Without Repeating Characters
 Given a string s, find the length of the longest substring without repeating characters.
 Input: s = "abcabcbb"
Output: 3
Input: s = "bbbbb"
Output: 1
Input: s = "pwwkew"
Output: 3
* */
public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepeatingChar("pwwkew"));
    }
    public static int longestSubstringWithoutRepeatingChar(String string) {
        Map<Character,Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for (int  right = 0; right <string.length(); right ++) {
            char currentChar = string.charAt(right);
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                left = map.get(currentChar) + 1;
            }
            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

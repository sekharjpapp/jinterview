package com.pixel.leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // If lengths are not equal, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create a frequency map for the characters in s
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Decrement the frequency for characters in t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false; // Character doesn't exist in s
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        // If map is empty, the strings are anagrams
        return map.isEmpty();
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        String s = "listen";
        String t = "silent";

        System.out.println("Are they anagrams? " + va.isAnagram(s, t));
    }
}


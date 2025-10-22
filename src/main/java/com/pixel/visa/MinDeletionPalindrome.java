package com.pixel.visa;

import java.util.HashMap;
import java.util.Map;

public class MinDeletionPalindrome {
    public static void main(String[] args) {
        String input = "aebcbda";
        Map<Character, Integer> removedChars = findRemovedChars(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Longest Palindromic Subsequence: \"" +
                longestPalindromicSubsequence(input) + "\"");
        System.out.println("Removed characters: " + removedChars);
    }
    public static Map<Character, Integer> findRemovedChars(String s) {
        String lps = longestPalindromicSubsequence(s);
        Map<Character, Integer> removed = new HashMap<>();

        // Count frequency of each character in original string
        Map<Character, Integer> originalCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            originalCount.put(c, originalCount.getOrDefault(c, 0) + 1);
        }

        // Count frequency of each character in LPS
        Map<Character, Integer> lpsCount = new HashMap<>();
        for (char c : lps.toCharArray()) {
            lpsCount.put(c, lpsCount.getOrDefault(c, 0) + 1);
        }

        // Find removed characters (present in original but not in LPS, or with reduced count)
        for (char c : originalCount.keySet()) {
            int originalFreq = originalCount.get(c);
            int lpsFreq = lpsCount.getOrDefault(c, 0);
            int removedCount = originalFreq - lpsFreq;

            if (removedCount > 0) {
                removed.put(c, removedCount);
            }
        }

        return removed;
    }

    public static String longestPalindromicSubsequence(String s) {
        int n = s.length();
        String[][] dp = new String[n][n];

        // Initialize diagonal (single characters)
        for (int i = 0; i < n; i++) {
            dp[i][i] = String.valueOf(s.charAt(i));
        }

        // Fill the DP table
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 2) {
                        dp[i][j] = String.valueOf(s.charAt(i)) + s.charAt(j);
                    } else {
                        dp[i][j] = s.charAt(i) + dp[i + 1][j - 1] + s.charAt(j);
                    }
                } else {
                    String left = dp[i][j - 1];
                    String right = dp[i + 1][j];

                    if (left.length() > right.length()) {
                        dp[i][j] = left;
                    } else {
                        dp[i][j] = right;
                    }
                }
            }
        }

        return dp[0][n - 1];
    }
}

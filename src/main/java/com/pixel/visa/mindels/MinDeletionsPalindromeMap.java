package com.pixel.visa.mindels;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MinDeletionsPalindromeMap {

    // Build LCS DP table
    public static int[][] buildLcsTable(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp;
    }

    // Backtrack only in `s` to find deletions
    public static Map<Character, Integer> findDeletions(String s, String rev, int[][] dp) {
        int i = s.length();
        int j = rev.length();
        Map<Character, Integer> deletions = new LinkedHashMap<>();

        while (i > 0 && j > 0) {
            if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                i--;
                j--;
            } else {
                if (dp[i - 1][j] >= dp[i][j - 1]) {
                    // delete from s
                    deletions.put(s.charAt(i - 1),
                            deletions.getOrDefault(s.charAt(i - 1), 0) + 1);
                    i--;
                } else {
                    // just move left in rev (ignore, don’t count deletions in rev)
                    j--;
                }
            }
        }

        // Remaining characters in s must also be deleted
        while (i > 0) {
            deletions.put(s.charAt(i - 1),
                    deletions.getOrDefault(s.charAt(i - 1), 0) + 1);
            i--;
        }

        return deletions;
    }

    public static void main(String[] args) {
        String s = "aebcbda";
        String rev = new StringBuilder(s).reverse().toString();

        // Step 1: Build LCS DP
        int[][] dp = buildLcsTable(s, rev);

        // Step 2: Find characters to delete
        Map<Character, Integer> deletions = findDeletions(s, rev, dp);

        // Step 3: Print result
        deletions.forEach((ch, cnt) -> System.out.println(ch + "=" + cnt));
    }
}


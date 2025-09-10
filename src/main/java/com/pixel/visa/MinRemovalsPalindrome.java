package com.pixel.visa;

/*
* return empty map is no characters has to be removed.
* Given a string s of length n, the task is to remove or delete the minimum number of
* characters from the string so that the resultant string is a palindrome.
* input:  aebcbda
*  e: 1, d: 1
* */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinRemovalsPalindrome {
    public static void main(String[] args) {
        String s = "aebcbda";
        Map<Character, Integer> result = getCharactersToRemoveForPalindrome(s);
        System.out.println(result);
    }

    public static Map<Character, Integer> getCharactersToRemoveForPalindrome(String s) {
        int n = s.length();
        int[][] dp = computeLPSDPTable(s);
        int lpsLength = dp[0][n - 1];
        int minDeletions = n - lpsLength;
        if (minDeletions == 0) {
            return Collections.emptyMap();
        } else {
            String lps = reconstructLPS(s, dp);
            return findRemovedCharacters(s, lps);
        }
    }

    private static int[][] computeLPSDPTable(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (cl == 2) {
                        dp[i][j] = 2;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }
        return dp;
    }

    private static String reconstructLPS(String s, int[][] dp) {
        int n = dp.length;
        int i = 0, j = n - 1;
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                left.append(s.charAt(i));
                if (i != j) {
                    right.append(s.charAt(j));
                }
                i++;
                j--;
            } else {
                if (dp[i][j] == dp[i + 1][j]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return left.toString() + right.reverse().toString();
    }

    private static Map<Character, Integer> findRemovedCharacters(String original, String lps) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;

        while (i < original.length() && j < lps.length()) {
            if (original.charAt(i) == lps.charAt(j)) {
                i++;
                j++;
            } else {
                char c = original.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
                i++;
            }
        }
        while (i < original.length()) {
            char c = original.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            i++;
        }
        return map;
    }
}

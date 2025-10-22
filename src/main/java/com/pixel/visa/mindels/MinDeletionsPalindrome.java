package com.pixel.visa.mindels;

public class MinDeletionsPalindrome {
    public static void main(String[] args) {
        String s = "aebcbda";
        System.out.println("Minimum deletions: " + minDeletions(s));
    }
    // Function to find LCS (Longest Common Subsequence)
    public static int lcs(String s1, String s2) {
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
        return dp[n][m];
    }
    // Function to find minimum deletions
    public static int minDeletions(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int lps = lcs(s, rev);
        return s.length() - lps;
    }
}

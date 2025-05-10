package com.pixel.altimetrik;

public class KPalindrome {
    public static void main(String[] args) {
        String str1 = "abcdecba";
        int k1 = 1;
        System.out.println("Is \"" + str1 + "\" a K-Palindrome with k=" + k1 + "? " + isKPalindrome(str1, k1));

        String str2 = "abcdeca";
        int k2 = 2;
        System.out.println("Is \"" + str2 + "\" a K-Palindrome with k=" + k2 + "? " + isKPalindrome(str2, k2));
    }

    public static boolean isKPalindrome(String s, int k) {
        int n = s.length();
        // Find minimum deletions required to make the string a palindrome
        int minDeletions = minDeletionsToPalindrome(s, 0, n - 1, new Integer[n][n]);
        // Check if the deletions are within the limit k
        return minDeletions <= k;
    }

    private static int minDeletionsToPalindrome(String s, int left, int right, Integer[][] memo) {
        // Base case: If the substring has 1 or no character, it's already a palindrome
        if (left >= right) {
            return 0;
        }

        // Check memoized result
        if (memo[left][right] != null) {
            return memo[left][right];
        }

        // If characters are the same, move inward
        if (s.charAt(left) == s.charAt(right)) {
            memo[left][right] = minDeletionsToPalindrome(s, left + 1, right - 1, memo);
        } else {
            // If characters are different, delete from either end and take the minimum
            int deleteLeft = 1 + minDeletionsToPalindrome(s, left + 1, right, memo);
            int deleteRight = 1 + minDeletionsToPalindrome(s, left, right - 1, memo);
            memo[left][right] = Math.min(deleteLeft, deleteRight);
        }

        return memo[left][right];
    }
}


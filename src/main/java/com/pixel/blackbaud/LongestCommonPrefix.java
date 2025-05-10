package com.pixel.blackbaud;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.substring(0, i);
            }
        }
        return a.substring(0, len);
    }
    public static void main(String[] args) {
        String a = "abcddd";
        String b = "cdddaab";

        // Find the longest common prefix
        String c = longestCommonPrefix(a, b);

        System.out.println("Longest Common Prefix: " + c);
    }
}

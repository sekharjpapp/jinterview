package com.pixel.americanairline.dsa;

public class PalindromeCheckSingle {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase(); // Convert to lowercase
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}

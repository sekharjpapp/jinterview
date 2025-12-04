package com.pixel.meta;

public class PalindromePhrase {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome? " + isPalindrome(s)); // true
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left pointer until it points to an alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Move right pointer until it points to an alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare lowercase versions of the characters
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // Move pointers inward
            left++;
            right--;
        }

        return true;
    }
}

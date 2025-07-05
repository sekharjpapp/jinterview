package com.pixel.leetcode;

public class ReverseVowelsofaString {
    public static void main(String[] args) {
/*
        Example 1:
        Input: s = "IceCreAm"
        Output: "AceCreIm"
        Explanation:
        The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
*/

                String str = "IceCreAm";
        System.out.println(reverseVowels(str));
    }
    public static String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {
            // Move start pointer until it points to a vowel
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }

            // Move end pointer until it points to a vowel
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }

            // Swap the vowels
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        String answer = new String(word);
        return answer;
    }
}

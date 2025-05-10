package com.pixel.americanairline;

public class ReverseStrwhereKis2 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int left = 0;

        while (left < chars.length) {
            int right = Math.min(left + k - 1, chars.length - 1);
            swap(chars, left, right);
            left += 2 * k;
        }

        return new String(chars);
    }

    private static void swap(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}

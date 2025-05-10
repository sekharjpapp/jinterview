package com.pixel.optum;

public class ReverseEvenCharacters {
    public static void main(String[] args) {
        String input = "abcdef";
        String output = reverseEvenCharacters(input);
        System.out.println("Output: " + output);  // Output: bacdfe
    }
    public static String reverseEvenCharacters(String input) {
        char[] charArray = input.toCharArray();
        int len = charArray.length;

        for (int i = 0; i < len; i += 4) {
            int end = Math.min(i + 2, len);
            reverseSubArray(charArray, i, end);
        }
        return new String(charArray);
    }

    private static void reverseSubArray(char[] array, int start, int end) {
        while (start < end - 1) {
            char temp = array[start];
            array[start] = array[end - 1];
            array[end - 1] = temp;
            start++;
            end--;
        }
    }

}

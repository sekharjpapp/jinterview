package com.pixel.americanairline;

public class ReverseEachWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        int left = 0; // Pointer to the start of a word

        for (int right = 0; right < charArray.length; right++) {
            // When we reach a space or the end of the array, we reverse the word
            if (right == charArray.length - 1 || charArray[right] == ' ') {
                int end = (right == charArray.length - 1) ? right : right - 1; // end index of the word
                reverse(charArray, left, end);
                left = right + 1; // Move left pointer to the start of the next word
            }
        }

        return new String(charArray);
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            // Swap the characters at the left and right pointers
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

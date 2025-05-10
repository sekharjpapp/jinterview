package com.pixel.general;

public class StringReverseTwopointer {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseAString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
    public static String reverseAString(String str) {
        //convert String to char array
        char[] charArray = str.toCharArray();
        // Declar left and right pointers
        int left = 0; int right = charArray.length-1;

        while (left < right) {
            swap(charArray,left,right);

            left++;
            right--;
        }
        return new String(charArray);
    }

    private static void swap(char[] charArray, int left, int right) {
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
    }
}

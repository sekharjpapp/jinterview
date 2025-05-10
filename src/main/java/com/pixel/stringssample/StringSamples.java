package com.pixel.stringssample;

public class StringSamples {
    public static void main(String[] args) {
        String str = "Hello";
        //System.out.println(str.charAt(3));
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            //System.out.println(str.charAt(i));
        }
        System.out.println(reverse);
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] arr = str.toCharArray();
       while (left < right) {
           swapString(arr,left,right);
           left++;
           right--;
       }
       return new String(arr);
    }
    private static void swapString(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

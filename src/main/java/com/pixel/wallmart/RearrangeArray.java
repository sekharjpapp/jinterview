package com.pixel.wallmart;

import java.util.Arrays;

/*
Input:
* arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output:
[-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
 * */
public class RearrangeArray {
    public static int[] replaceMissingNumbers(int[] arr, int n) {
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize with -1
        // Fill in existing numbers
        for (int num : arr) {
            if (num >= 0 && num < n) { // Check if num is within range
                result[num] = num;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int n = 10; // Maximum number in the sequence (0-9)
        int[] result = replaceMissingNumbers(arr, n);
        // Print the result
        System.out.println(Arrays.toString(result));
    }
}

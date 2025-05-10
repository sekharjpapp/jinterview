package com.pixel.enyqns;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of positions to rotate

        rotate(array, k);

        System.out.println("Rotated Array: " + Arrays.toString(array));
    }

    public static void rotate(int[] array, int k) {
        int n = array.length;
        k = k % n; // Handle cases where k is greater than n

        // Reverse the whole array
        reverse(array, 0, n - 1);
        // Reverse the first k elements
        reverse(array, 0, k - 1);
        // Reverse the remaining n - k elements
        reverse(array, k, n - 1);
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            // Swap the elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}


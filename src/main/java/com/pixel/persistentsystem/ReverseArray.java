package com.pixel.persistentsystem;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Store the value of arr.length - 1 separately
        int lastIndex = arr.length - 1;

        // Reverse the array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[lastIndex - i];
            arr[lastIndex - i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

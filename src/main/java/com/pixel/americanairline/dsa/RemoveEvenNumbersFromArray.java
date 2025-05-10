package com.pixel.americanairline.dsa;

import java.util.Arrays;

public class RemoveEvenNumbersFromArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] result = removeEvenNumbers(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Even Numbers Removed: " + Arrays.toString(result));
    }

    private static int[] removeEvenNumbers(int[] arr) {
        // First, count the number of odd numbers
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        // Create a new array to store only odd numbers
        int[] result = new int[oddCount];
        int j = 0;

        // Populate the result array with odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[j] = arr[i];
                j++;
            }
        }

        return result;
    }


}

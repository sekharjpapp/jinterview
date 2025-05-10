package com.pixel.general;

public class NthHighestNumber {

    public static int findNthHighest(int[] arr, int n) {
        int size = arr.length;

        // Edge case: If n is larger than the array size
        if (n > size || n <= 0) {
            throw new IllegalArgumentException("Invalid value of n");
        }

        // Variable to store the nth highest number
        int max = Integer.MIN_VALUE;

        // Loop to find the nth highest number
        for (int i = 0; i < n; i++) {
            max = Integer.MIN_VALUE; // Reset max for each iteration
            int maxIndex = -1;

            // Find the largest number in the remaining array
            for (int j = 0; j < size; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }

            // Mark this max number as visited by setting it to a value that will not interfere
            arr[maxIndex] = Integer.MIN_VALUE;  // Temporarily mark this as visited (since we're finding the next max)
        }

        // After the loop, the nth largest number is stored in max
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 6, 7, 2, 8, 4};
        int n = 3;  // Example: find the 3rd highest number

        int nthHighest = findNthHighest(arr, n);
        System.out.println(n + "th highest number is: " + nthHighest);
    }
}



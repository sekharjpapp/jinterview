package com.pixel.general;

public class MissingNumberXOR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array, missing number is 3
        int n = 6; // n is the total count of numbers from 1 to n

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
    public static int findMissingNumber(int[] arr, int n) {
        int xor1 = 0; // XOR of all numbers from 1 to n
        int xor2 = 0; // XOR of all elements in the array

        // XOR numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // XOR all elements in the array
        for (int num : arr) {
            xor2 ^= num;
        }

        // The missing number is xor1 ^ xor2
        return xor1 ^ xor2;
    }
}

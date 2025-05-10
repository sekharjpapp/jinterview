package com.pixel.americanairline.dsa;

public class MoveZerosWithSwap {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * Moves all zeros to the end of the array.
     *
     * @param arr The input array.
     * @return The array with zeros moved to the end.
     */
    public static int[] moveZeros(int[] arr) {
        int nonZeroPtr = 0; // Pointer for non-zero elements

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // If current element is not zero, swap with nonZeroPtr
            if (arr[i] != 0) {
                swap(arr, i, nonZeroPtr);
                nonZeroPtr++; // Increment nonZeroPtr
            }
        }

        return arr;
    }

    /**
     * Swaps two elements in the array.
     *
     * @param arr The array.
     * @param i   Index of the first element.
     * @param j   Index of the second element.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

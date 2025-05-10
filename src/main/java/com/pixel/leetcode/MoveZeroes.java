package com.pixel.leetcode;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(java.util.Arrays.toString(nums)); // Output: [1, 3, 12, 0, 0]
    }
    public static void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;

        // Move non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the current element with the element at lastNonZeroIndex
                int temp = nums[i];
                nums[i] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;
                lastNonZeroIndex++;
            }
        }
    }
}

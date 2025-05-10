package com.pixel.leetcode;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // Swap nums[low] and nums[mid] and increment both pointers
                    swap(nums, low, mid);
                    mid++;
                    low++;
                    break;
                case 1:
                    // Just move mid pointer forward
                    mid++;
                    break;
                case 2:
                    // Swap nums[mid] and nums[high] and decrement high pointer
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

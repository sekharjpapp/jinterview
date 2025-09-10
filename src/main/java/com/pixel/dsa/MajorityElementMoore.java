package com.pixel.dsa;

public class MajorityElementMoore {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element: " + majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        // Step 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        // Step 2: (Optional) Verify candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }
}

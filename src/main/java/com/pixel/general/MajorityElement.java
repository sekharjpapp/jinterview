package com.pixel.general;

public class MajorityElement {

    public static Integer findMajorityElement(int[] nums) {
        int candidate = 0, count = 0;

        // Phase 1: Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if candidate is the majority element
        if (count > nums.length / 2) {
            return candidate;
        }
        return null; // No majority element
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        Integer result = findMajorityElement(nums);

        if (result != null) {
            System.out.println("The majority element is: " + result);
        } else {
            System.out.println("There is no majority element.");
        }
    }
}


package com.pixel.general;

import java.util.PriorityQueue;

public class NthHighestNumberQueue {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 12, 2, 11};
        int n = 2;
        System.out.println(nthHighestNumber(nums, n));
    }
    public static Integer nthHighestNumber(int[] nums, int n) {
        if (nums == null || nums.length < n) {
            System.out.println("Array size is smaller than " + n);
            return null; // or throw an exception if preferred
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num:nums) {
            minHeap.add(num);
            if (minHeap.size() >n) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}

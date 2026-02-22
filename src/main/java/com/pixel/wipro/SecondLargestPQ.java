package com.pixel.wipro;

import java.util.Collections;
import java.util.Optional;
import java.util.PriorityQueue;

public class SecondLargestPQ {
    public static Optional<Integer> kthLargest(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return Optional.empty();
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : nums) {
            minHeap.offer(n);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return Optional.ofNullable(minHeap.peek());
    }

    public static void main(String[] args) {
        int[] arr = {};
        Optional<Integer> result = kthLargest(arr, 2);
        Optional<Integer> result1 = kthLargest(arr, 3);
        result.ifPresentOrElse(
                v -> System.out.println("Kth Largest = " + v),
                () -> System.out.println("No result!")
        );

    }
}

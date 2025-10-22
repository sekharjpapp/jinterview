package com.pixel.leetcode;

import java.util.*;

public class KthLargestUsingMinHeap {
    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest
            }
        }

        return minHeap.peek(); // root = kth largest
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println("Kth Largest: " + findKthLargest(arr, k));
    }
}


package com.pixel.leetcode;

import java.util.*;

public class KthSmallestUsingMaxHeap {
    public static int findKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int num : arr) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove largest
            }
        }

        return maxHeap.peek(); // root = kth smallest
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        
        System.out.println("Kth Smallest: " + findKthSmallest(arr, k));
    }
}


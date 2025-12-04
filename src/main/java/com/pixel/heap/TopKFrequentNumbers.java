package com.pixel.heap;

import java.util.*;

public class TopKFrequentNumbers {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a Min Heap sorted by frequency
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        // Step 3: Keep top K elements in the heap
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 4: Extract elements from heap
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }

        // Optional: Reverse for descending order
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {8, 10, 7, 8, 11, 30, 11, 8, 7, 8, 11, 2, 4, 2, 8};
        int k = 3;
        System.out.println("Top " + k + " frequent elements: " + topKFrequent(nums, k));
    }
}


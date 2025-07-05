package com.pixel.wipro;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * This class provides a method to reorganize a string such that no two adjacent characters are the same.
 * If it's not possible to reorganize the string, it returns an empty string.
 * the algorithm uses a max heap to prioritize characters based on their frequency.
 * * Example:
 * Input: "aaabb"
 * Output: "aba" or "bab" (any valid reorganization)
 * Input: "aaab"
 * Output: "" (not possible to reorganize)
 */

public class ReorganizeString {

    public static String reorganizeString(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Step 1: Count the frequency of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Add characters to the max heap based on frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        maxHeap.addAll(frequencyMap.keySet());

        // Step 3: Build the reorganized string
        StringBuilder result = new StringBuilder();
        Character previousChar = null;

        while (!maxHeap.isEmpty()) {
            char currentChar = maxHeap.poll();

            // Append the most frequent character
            result.append(currentChar);

            // If there was a previous character, re-add it back to the heap
            if (previousChar != null) {
                maxHeap.add(previousChar);
            }

            // Update the frequency of the current character and set it as the previousChar for the next iteration
            frequencyMap.put(currentChar, frequencyMap.get(currentChar) - 1);
            previousChar = frequencyMap.get(currentChar) > 0 ? currentChar : null;
        }

        // If the reorganized string length is not equal to the input string length, return ""
        return result.length() == s.length() ? result.toString() : "";
    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aaabb")); // Possible output: "aba"
        System.out.println(reorganizeString("aaab")); // Output: ""
    }
}

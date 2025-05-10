package com.pixel.coforge;

import java.util.ArrayList;
import java.util.List;

public class StringCombinations {
    public static void main(String[] args) {
        String input = "ABC";

        // Generate combinations
        List<String> combinations = generateCombinations(input);

        // Print the combinations
        System.out.println("Combinations for string \"" + input + "\":");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
    // Method to generate combinations
    public static List<String> generateCombinations(String str) {
        List<String> result = new ArrayList<>();
        // Start the recursive combination generation
        generateCombinationsRecursive(str, 0, "", result);
        return result;
    }

    // Recursive helper function to generate combinations
    private static void generateCombinationsRecursive(String str, int index, String current, List<String> result) {
        // If the index has reached the length of the string, return
        if (index == str.length()) {
            // If current string is not empty, add to the result list
            if (!current.isEmpty()) {
                result.add(current);
            }
            return;
        }

        // Include the current character and move to the next
        generateCombinationsRecursive(str, index + 1, current + str.charAt(index), result);

        // Exclude the current character and move to the next
        generateCombinationsRecursive(str, index + 1, current, result);
    }
}

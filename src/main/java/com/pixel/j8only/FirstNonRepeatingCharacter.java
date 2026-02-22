package com.pixel.j8only;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        long start1 = System.nanoTime();
        Character result = firstNonRepeatingCharacter(input);
        long end1 = System.currentTimeMillis();
        long start2 = System.nanoTime();
        Character resultJava8 = firstNonRepeatingCharacterJava8(input);
        long end2 = System.nanoTime();
        System.out.println("Java 8 only solution:");
        if (result != null) {
            System.out.println("First non-repeating character: " + result);
            System.out.println("Time taken (Normal): " + (end1 - start1) + " ns");
            System.out.println("First non-repeating character: " + resultJava8);
            System.out.println("Time taken (Java 8): " + (end2 - start2) + " ns");
        } else {
            System.out.println("All characters are repeating.");
        }
    }
    // how to calculate time complexity of this function
    private static Character firstNonRepeatingCharacter(String input) {
        int[] charCount = new int[26];
        for (char c : input.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : input.toCharArray()) {
            if (charCount[c - 'a'] == 1) {
                return c;
            }
        }
        return null;
    }
    // Java 8 only solution using LinkedHashMap
    private static Character firstNonRepeatingCharacterJava8(String input) {
        LinkedHashMap<String, Long> collect = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
        return collect.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey().charAt(0))
                .findFirst()
                .orElse(null);
    }
}

package com.pixel.githubsample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 5};

        OptionalInt secondHighest = Arrays.stream(arr)
                .distinct()                   // Remove duplicates
                .boxed()                      // Convert int to Integer
                .sorted(Comparator.reverseOrder()) // Sort descending
                .skip(1)                      // Skip the highest
                .mapToInt(Integer::intValue) // Convert back to int
                .findFirst();                // Get the second highest

        if (secondHighest.isPresent()) {
            System.out.println("Second highest: " + secondHighest.getAsInt());
        } else {
            System.out.println("Second highest number not found.");
        }
    }
}

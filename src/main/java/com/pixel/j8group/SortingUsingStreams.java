package com.pixel.j8group;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

        // Sorting in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted numbers in ascending order: " + sortedNumbers);

        // Sorting in descending order
        List<Integer> sortedNumbersDesc = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("Sorted numbers in descending order: " + sortedNumbersDesc);

    }
}

package com.pixel.enyqns;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStringFinder {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape", "apple");

        // Find and print duplicates
        Set<String> duplicates = findDuplicates(input);
        System.out.println("Duplicate Strings: " + duplicates);
    }
    public static Set<String> findDuplicates(List<String> arr) {

        return arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}

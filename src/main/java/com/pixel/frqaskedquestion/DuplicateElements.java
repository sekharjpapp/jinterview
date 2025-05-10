package com.pixel.frqaskedquestion;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 6, 3, 7, 8, 9};
        findDuplicates(arr);
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<String> list = Arrays.asList("Java", null, "Streams", "API", null);

        // Safely handling nulls in the stream
        String collect = list.stream()
                .filter(Objects::nonNull)  // Filters out nulls
                .map(String::toUpperCase)  // Converts to uppercase
                .collect(Collectors.joining(" "));// Output: JAVA STREAMS API
    }
    public static void findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}

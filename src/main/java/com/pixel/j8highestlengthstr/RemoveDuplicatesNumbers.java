package com.pixel.j8highestlengthstr;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicatesNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 1};

        int[] result = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .mapToInt(Map.Entry::getKey)
                .toArray();

        System.out.println(Arrays.toString(result)); // Output: [3, 4]
    }
}

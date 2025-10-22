package com.pixel.epam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RecreatetheStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // Create the stream and map each element to 2
        Stream<Integer> result = list.stream().map(i -> i * 2);

        // Print the result using forEach
        result.forEach(System.out::println);  // Outputs: 2 for each element

        // Re-create the stream and collect to a list
        List<Integer> collectedList = list.stream()
                .map(i -> i * 2)  // Apply the map transformation again
                .collect(Collectors.toList());  // Collect to a List

        // Print the collected list
        System.out.println(collectedList);  // Outputs: [2, 4, 6, 8, 10]
    }
}

package com.pixel.j8highestlengthstr;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/*
 * This code groups a list of integers into ranges of 10.
 * It uses Java Streams to achieve this in a concise manner.
 */

public class GroupNumbersByRange {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10,14, 15, 20, 25, 30, 35, 40, 45, 50};
        List<Integer> integers = Arrays.stream(arr).boxed().toList();

        integers.stream().collect(Collectors.groupingBy(x -> x / 10 * 10, LinkedHashMap::new,Collectors.toList()))
                .forEach((key, value) -> System.out.println("Range: " + key + " - " + (key + 9) + " -> " + value));
    }
}

package com.pixel.j8highestlengthstr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
    * This code partitions a list of integers into two lists: one containing even numbers and the other containing odd numbers.
    * It uses Java Streams to achieve this in a concise manner.
 */

public class ListsofEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> collect = Arrays.stream(arr).boxed().toList();

        List<List<Integer>> collect1 = new ArrayList<>(collect.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList()))
                .values());

        System.out.println(collect1);
    }
}

package com.pixel.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {

        int[] arr = {4,5,6,6,7,8,8};

        Set<Integer> collect = Arrays.stream(arr).boxed()
                .filter(i -> Collections.frequency(Arrays.asList(4, 5, 6, 6, 7, 8, 8), i) > 1)
                .collect(Collectors.toSet());

        System.out.println(collect);
    }
}

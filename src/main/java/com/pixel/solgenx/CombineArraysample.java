package com.pixel.solgenx;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* * Input:
 * arr1 = {1, 3, 5, 7}
 * arr2 = {2, 4, 6, 8}
 * Output:
 * [1, 2, 3, 4, 5, 6, 7, 8]
 */

public class CombineArraysample {
    public static void main(String[] args) {
        //Write a function to merge two sorted arrays into a single sorted
        // array. int[] arr1 = {1, 3, 5, 7}; int[] arr2 = {2, 4, 6, 8}
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

//        IntStream first = Arrays.stream(arr1);
//        IntStream second = Arrays.stream(arr2);

        //first.boxed().flatMap()

        int[] array = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(array));

    }
}

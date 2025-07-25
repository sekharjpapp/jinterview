package com.pixel.j8highestlengthstr;

import java.util.Arrays;
/*
    * This code calculates the product of the first two elements in an array of integers.
 */

public class ProductsOfFirstTwoElements {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 4, 5};

        Integer reduce = Arrays.stream(arr).boxed().toList()
                .stream().limit(2).reduce(1, (a, b) -> a * b);
        System.out.println(reduce);
    }
}

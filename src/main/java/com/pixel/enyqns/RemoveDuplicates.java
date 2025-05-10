package com.pixel.enyqns;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        Arrays.stream(str.split(""))
                .distinct()
                .forEach(System.out::println);
    }
}

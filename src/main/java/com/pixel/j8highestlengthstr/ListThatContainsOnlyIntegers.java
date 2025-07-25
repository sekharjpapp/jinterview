package com.pixel.j8highestlengthstr;

import java.util.Arrays;
/*
 * This code filters a list of strings to keep only those that represent integers.
 * It uses Java Streams to achieve this in a concise manner.
 */

public class ListThatContainsOnlyIntegers {
    public static void main(String[] args) {
        String[] text = { "abc", "123", "456", "def", "789", "ghi" };

        Arrays.stream(text).filter(x-> x.matches("[0-9]+")) // Filter to keep only strings that are integers
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}

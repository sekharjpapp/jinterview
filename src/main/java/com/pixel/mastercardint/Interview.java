package com.pixel.mastercardint;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Given a List of Integer, find the maximum value element present in it using Java 8 Stream API.
public class Interview {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 7, 2, 8, 1);
        Optional<Integer> secondHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        System.out.println(secondHighest);
    }
}

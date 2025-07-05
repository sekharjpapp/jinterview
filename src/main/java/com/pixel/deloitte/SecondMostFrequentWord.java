package com.pixel.deloitte;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class demonstrates how to find the second most frequent word in a list of words using Java Streams.
 * count second most frequent word in a list ?
 */
public class SecondMostFrequentWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "banana", "apple", "kiwi", "banana");

        Optional<String> secondMostFrequent = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .skip(1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(secondMostFrequent);

        secondMostFrequent.ifPresentOrElse(
                word -> System.out.println("Second most frequent word: " + word),
                () -> System.out.println("Second most frequent word not found")
        );
    }
}

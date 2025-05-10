package com.pixel.cignititech;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class StringProcessing {
    public static void main(String[] args) {
        List<String> words = List.of("Scala", "Java", "Kotlin", "Python", "Go", "Rust");

        // Use case 1: Concatenate words with length > 4
        String longWords = processStrings(words, word -> word.length() > 4, (a, b) -> a + " " + b, "").trim();
        System.out.println("Words longer than 4 characters: " + longWords);

        // Use case 2: Concatenate words that start with 'J' or 'S'
        String jsWords = processStrings(words, word -> word.startsWith("J") || word.startsWith("S"), (a, b) -> a + " " + b, "").trim();
        System.out.println("Words starting with J or S: " + jsWords);

        // Use case 3: Sum of all word lengths for words containing 'o'
        int totalLength = words.stream()
                .filter(word -> word.contains("o"))
                .mapToInt(String::length)
                .sum();
        System.out.println("Total length of words containing 'o': " + totalLength);

    }
    // Generic method to process strings using predicates and aggregation
    public static String processStrings(List<String> list, Predicate<String> selector, BinaryOperator<String> aggregator, String initial) {
        return list.stream()
                .filter(selector)
                .reduce(initial, aggregator);
    }
}

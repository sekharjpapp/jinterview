package com.pixel.altimetrik;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String input = "This this is is done by Developer Developer";

        wordFrequencyOne(input);
        wordFrequencyTwo(input);
    }

    private static void wordFrequencyOne(String input) {
        Map<String, Long> wordCount = Arrays.stream(input.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(wordCount);
        //wordCount.forEach((k,v)-> System.out.println(k + " = " + v));
    }
    private static void wordFrequencyTwo(String input) {
        LinkedHashMap<String, Long> duplicates = Arrays.stream(input.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(w -> w.getValue() > 1)
                //.map(Map.Entry::getKey)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));// Preserve order
        System.out.println(duplicates);
    }
}

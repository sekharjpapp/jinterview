package com.pixel.hashmapcount;

import java.util.HashMap;
import java.util.Map;

public class HashMapCount {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.computeIfAbsent("One",k->1);
        map.computeIfAbsent("One",k->2);
        System.out.println(map.get("One"));
        String[] words = {"java", "spring", "java", "kafka", "spring", "java"};
        generateFrequencyMap(words);
    }
    // Real-world use case: Counters / Frequency Map
    //Scenario:
    //Count how many times each word appears (log analysis, metrics, etc.)
    public static void generateFrequencyMap(String[] words) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.computeIfAbsent(word, k -> 0);
            frequencyMap.compute(word, (k, v) -> v + 1);
        }
        System.out.println(frequencyMap);
    }
}

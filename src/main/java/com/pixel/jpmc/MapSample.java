package com.pixel.jpmc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This class demonstrates how to convert a Map<String, Integer> to a Map<Integer, List<String>> using Java Streams.
 * The keys of the original map are grouped by their values, and the keys are collected into lists.
 */
public class MapSample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("tom",28);
        map.put("bob",31);
        map.put("jerry",35);
        map.put("chris",38);
        map.put("alice",28);

        Map<Integer, List<String>> integerListMap = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        System.out.println(integerListMap);
    }
}

package com.pixel.jpmc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("tom",28);
        map.put("bob",31);
        map.put("jerry",35);
        map.put("chris",38);

        Map<Integer, List<String>> integerListMap = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        System.out.println(integerListMap);
    }
}

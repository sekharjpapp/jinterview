package com.pixel.capgemini;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatCharcterUsingJ8 {
    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatedChar("success"));
    }
    public static String getFirstNonRepeatedChar(String str) {
        return str
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(e -> e.getKey().toString())
                .orElse("no non repeated key found");
    }
}

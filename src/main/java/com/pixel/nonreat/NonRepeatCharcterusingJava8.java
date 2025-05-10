package com.pixel.nonreat;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatCharcterusingJava8 {
    public static void main(String[] args) {
        List<String> str = List.of("success");


        String key = str.stream()
                .flatMap(s->s.chars().mapToObj(c->(char)c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(e->e.getKey().toString())
                .orElse("no non repeated key found");

        System.out.println(key);

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

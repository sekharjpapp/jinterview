package com.pixel.general;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofEachCharacter {
    public static void main(String[] args) {
        String str = "hello World";

        Map<String, Long> charCount = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);
    }
}

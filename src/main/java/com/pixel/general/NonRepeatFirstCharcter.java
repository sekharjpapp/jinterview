package com.pixel.general;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatFirstCharcter {
    public static void main(String[] args) {
        String str = "ilovejavatechie";

        String nonRepeatedString = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(nonRepeatedString);
    }
}

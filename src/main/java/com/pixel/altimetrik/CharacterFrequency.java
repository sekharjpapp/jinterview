package com.pixel.altimetrik;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "This";

        Map<String, Long> charFrequency = Arrays.stream(input.split(""))
                .filter(c-> !c.equals("T"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charFrequency.forEach((k,v)-> System.out.println(k + " = " + v));
    }
}

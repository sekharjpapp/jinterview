package com.pixel.epam;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Hello World Java Streams";

        String reversedWord = Arrays.stream(input.split(" "))
                .map(revWord -> new StringBuilder(revWord).reverse().toString())
                //.reduce("", (a, b) -> b + a).trim();
                        .collect(Collectors.joining(" "));
        System.out.println(reversedWord);
    }
}

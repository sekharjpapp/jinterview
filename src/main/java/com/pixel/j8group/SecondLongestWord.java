package com.pixel.j8group;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLongestWord {
    public static void main(String[] args) {
        String sentence = "Java developer skilled in Spring Boot and microservices";

        String string = Arrays.stream(sentence.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse("");
        System.out.println(string);
    }
}

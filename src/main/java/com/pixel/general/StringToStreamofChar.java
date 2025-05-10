package com.pixel.general;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToStreamofChar {
    public static void main(String[] args) {
        String str = "hello world";

        List<Character> characterStream = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        System.out.println(characterStream);
    }
}

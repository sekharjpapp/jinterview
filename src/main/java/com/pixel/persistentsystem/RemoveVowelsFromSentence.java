package com.pixel.persistentsystem;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveVowelsFromSentence {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String withoutVowels = removeVowels(sentence);
        System.out.println(withoutVowels);
        System.out.println(removeVowelsWithJava8(sentence));
    }
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    public static String removeVowelsWithJava8(String str) {
        return Arrays.stream(str.split(""))
                .filter(s -> !s.matches("[aeiouAEIOU]"))
                .collect(Collectors.joining());
    }
}

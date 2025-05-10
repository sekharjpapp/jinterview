package com.pixel.enyqns;

import java.util.Arrays;
import java.util.List;

public class VowelCounter {
    public static void main(String[] args) {
        String input = "Hello, World! Java Streams are powerful.";
        long vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }
    public static long countVowels(String str) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        return str.chars().mapToObj(c->(char)c).filter(vowels::contains).count();
    }
}

package com.pixel.atnadt;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TransformStringUsingJava8 {
    public static void main(String[] args) {
        String str = "this was my name here";
        String capitalized = capitalizeWords(str);
        System.out.println(capitalized);
        System.out.println(capitalizeWordsOne(str));
    }
    public static String capitalizeWords(String str) {
        return Arrays.stream(str.split(" "))
                .map(word->word.substring(0,1).toUpperCase() +word.substring(1))
                .collect(Collectors.joining(" "));
    }
    public static String capitalizeWordsOne(String str) {
        return Arrays.stream(str.split(" "))
                .map(word->word.substring(0,1).toUpperCase() +word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}

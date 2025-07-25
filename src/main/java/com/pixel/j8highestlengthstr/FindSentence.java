package com.pixel.j8highestlengthstr;

import java.util.Arrays;
import java.util.Comparator;

/*
    * This program finds the longest word in a given text.
 */

public class FindSentence {
    public static void main(String[] args) {
        String text = "I am learning Java. It is a powerful programming language. I love coding in Java.";

        String finalText = Arrays.stream(text.split(" ")).max(Comparator.comparing(String::length)).get();

        System.out.println(finalText);
    }
}

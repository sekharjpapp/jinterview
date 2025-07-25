package com.pixel.j8highestlengthstr;

import java.util.Arrays;
import java.util.Comparator;

/*
    * This program finds the second highest length string from a given text.
    * It splits the text into words, sorts them by length in descending order,
    * skips the first (highest length) word, and retrieves the next one.
 */
public class SecondHighestLength {
    public static void main(String[] args) {
        String text = "I am learning Java. It is a powerful programming language. I love coding in Java.";

        String string = Arrays.stream(text.split(" ")).sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(string);
    }
}

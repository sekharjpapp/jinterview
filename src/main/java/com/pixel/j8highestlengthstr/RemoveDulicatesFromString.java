package com.pixel.j8highestlengthstr;

/*
    * This code removes duplicate characters from a string and prints the unique characters.
 */
public class RemoveDulicatesFromString {
    public static void main(String[] args) {
        String text  = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";

        text.chars().mapToObj(c-> (char) c)
            .distinct()
            .forEach(System.out::print);
    }
}

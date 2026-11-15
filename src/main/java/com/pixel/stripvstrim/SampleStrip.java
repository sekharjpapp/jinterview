package com.pixel.stripvstrim;

import java.util.stream.Collectors;

public class SampleStrip {
    public static void main(String[] args) {
        var result = " " + "42" + "\u2003";  // ✅ Correct
        System.out.println(charNames(result.trim()));
        System.out.println(charNames(result.strip()));
    }
    static String charNames(String text) {
        return text
                .chars()
                .mapToObj(Character::getName)
                .collect(Collectors.joining(" | "));
    }
}

package com.pixel.epam;

import java.util.stream.IntStream;

public class StringToChar {
    public static void main(String[] args) {
        String str = "hello";
        int input = 12345;
        IntStream chars = String.valueOf(input).chars();
        int sum = chars.map(Character::getNumericValue)
                .sum();
        System.out.println(sum);
    }
}

package com.pixel.general;

import java.util.Arrays;

public class LongestStringFromArray {
    public static void main(String[] args) {

        String[] strArray = {"java","scala","python","C","Rust"};

        String longestString = Arrays.stream(strArray)
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2)
                .get();
        System.out.println(longestString);
    }
}

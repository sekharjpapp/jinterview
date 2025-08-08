package com.pixel.wiproint;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWord {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Coffee", "Tea", "Sugarfree", "Sugar");

        String s = data.stream()
                .max(Comparator.comparingInt(String::length)).get();

        //longestWord.ifPresent(w-> System.out.println(longestWord));
        System.out.println(s);
        //System.out.println(longestWord);
        String str = "hello";
        str = str + "there";
        //System.out.println(str);

        String st = "1";
        st = st + 2;
        System.out.println(st);
    }
}

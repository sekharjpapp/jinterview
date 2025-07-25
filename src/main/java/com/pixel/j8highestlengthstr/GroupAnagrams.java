package com.pixel.j8highestlengthstr;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Group anagrams using a simple approach
        Map<String, List<String>> anagrams = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));

        // Print the grouped anagrams
        anagrams.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

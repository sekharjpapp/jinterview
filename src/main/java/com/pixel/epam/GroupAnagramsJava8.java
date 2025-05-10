package com.pixel.epam;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagramsJava8 {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Collection<List<String>> anagramGroup = Arrays.stream(str)
                .collect(Collectors.groupingBy((word) -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                })).values();
        System.out.println(anagramGroup);
    }
}

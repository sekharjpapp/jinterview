package com.pixel.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramGroupsStrems {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramGroups = groupAnagrams(strs);

        // Print anagram groups
        anagramGroups.forEach(System.out::println);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs)
                .collect(Collectors.groupingBy(
                        s -> {
                            char[] chars = s.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);
                        }
                )).values());
    }
}

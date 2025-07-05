package com.pixel.ps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This class groups anagrams from a given array of words.
 * It uses Java Streams to collect words into lists based on their sorted character representation.
 * * Example:
 * * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * * Output:
 * * [[eat, tea, ate], [tan, nat], [bat]]
 */

public class AnagramGrouper {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> anagramGroups = groupAnagrams(words);

        anagramGroups.forEach((sortedWord, anagrams) -> {
            System.out.println(anagrams);
        });
    }
    public static Map<String, List<String>> groupAnagrams(String[] words) {
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        word -> getSortedWord(word),
                        Collectors.toList()
                ));
    }
    private static String getSortedWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

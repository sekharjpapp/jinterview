package com.pixel.general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefixv1 {
    public static void main(String[] args) {
        String[] strings = {"club","clove", "clap"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] str) {
        StringBuilder result = new StringBuilder();

        Arrays.sort(str);
        // get first and last string
        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();

        for (int i = 0 ; i<first.length; i++) {
            if (first[i] != last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
}

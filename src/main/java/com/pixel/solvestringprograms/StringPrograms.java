package com.pixel.solvestringprograms;

import java.util.StringTokenizer;

public class StringPrograms {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseAString(str));

    }
    public static String reverseAString(String str) {
        String rev = "";
        for (int i=0; i<str.length();i++) {
            char c = str.charAt(i);
            rev = c + rev;
        }
        return rev;
    }
}

package com.pixel.stringssample;

public class StringTemplateUppercaseLetter {
    public static void main(String[] args) {

        String name = "John";

        int count = 0;
        for (int   i =0; i<name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

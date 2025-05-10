package com.pixel.stringssample;

public class StringTemplateOne {
    public static void main(String[] args) {
        String name = "John";

        for (int i=0; i<name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }
    }
}

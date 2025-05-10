package com.pixel.stringssample;

public class RemoveAllSpaces {
    public static void main(String[] args) {
        String str = "My name is John ";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isWhitespace(ch)) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}

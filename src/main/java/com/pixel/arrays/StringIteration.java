package com.pixel.arrays;

public class StringIteration {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        String rev = "";
        // Iterate through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.print(rev);
        System.out.println("____________________");
        String strCh = "Java is Fun!";
        for (char ch: strCh.toCharArray()) {
            System.out.print(ch);
        }
        char[] charArray = strCh.toCharArray();
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}

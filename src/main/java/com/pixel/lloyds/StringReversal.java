package com.pixel.lloyds;

public class StringReversal {
    public static void main(String[] args) {

        //strReverseWithSb();
        strRevWithForloop();
    }

    private static void strRevWithForloop() {
        String str = "heheee";
        String reverseStr = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);
    }

    private static void strReverseWithSb() {
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);

        for(int i = sb.length()-1; i >= 0; i--) {
            System.out.print(sb.charAt(i));
        }
    }

}

package com.pixel.morganstanley;

public class StreamsTrue {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1 += "World";
        String s2 = "Hello";
        s2 += "";
        s2 += "World";
        String s3 = s1.intern();
        String s4 = s2.intern();
        boolean b1  = s3 == s4 ;
        boolean b2 = s3.equals(s4);
        System.out.println(b2);
        System.out.println(b1);

    }
}

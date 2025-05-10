package com.pixel.j17venkat;

public class SampleInsance {
    public static void main(String[] args) {
        System.out.println(process(1));
        System.out.println(process("hello"));
    }

    private static String process(Object input) {
        if (input instanceof Integer) {
            return "got a number";
        }
        if (input instanceof String str) {
            return "got a String of length " +str.length();
        }
        return "What ever";
    }
}

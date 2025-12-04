package com.pixel.javapoly;

public class FinallyVsReturnType {
    public static void main(String[] args) {
     FinallyVsReturnType obj = new FinallyVsReturnType();
     int result = obj.method();
        System.out.println("Result: " + result);
    }
    public int method() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }
}

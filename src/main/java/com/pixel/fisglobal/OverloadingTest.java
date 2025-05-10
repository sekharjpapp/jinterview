package com.pixel.fisglobal;

public class OverloadingTest {
    public static void main(String[] args) {
           // show(null);
    }
   public static void show(Object o) {
        System.out.println("Object");
    }

    public static void show(String s) {
        System.out.println("String");
    }

    public static void show(StringBuilder sb) {
        System.out.println("StringBuilder");
    }
}

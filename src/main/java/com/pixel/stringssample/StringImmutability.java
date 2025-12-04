package com.pixel.stringssample;

public class StringImmutability {
    public static void main(String[] args) {
        String original = "hello";
        System.out.println("Original before: " + original); // "hello"
        System.out.println("Hashcode before: " + System.identityHashCode(original));

        String result = original + 1;  // This creates a NEW object

        System.out.println("Original after: " + original); // Still "hello" - unchanged!
        System.out.println("Result: " + result); // "hello1"
        System.out.println("Hashcode of result: " + System.identityHashCode(result));

        // Demonstrating that original string remains unchanged
        String a = "x";
        String b = "x";
        System.out.println("a and b refer to the same object: " + (a == b)); // true
        System.out.println(new String("x") == "x"); // false
        System.out.println(new String("x").intern() == "x"); // true
    }
}

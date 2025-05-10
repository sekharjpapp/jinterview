package com.pixel.javaint;

public class StringSample {
    public static void main(String[] args) {
        String x = "Ram";
        String a = new String("Ram");
        String b = new String(x);
        String c = "Ram";
        String d = "Ram";

        System.out.println(a==b); // false
        System.out.println(c==d); // true
        System.out.println(x==c); // true

    }
}

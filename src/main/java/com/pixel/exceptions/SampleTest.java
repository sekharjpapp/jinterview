package com.pixel.exceptions;

public class SampleTest {
    public static void main(String[] args) {
        process();
    }
    public static void process() {
        try {
            System.out.println(1);
            int i = Integer.parseInt("abc");
            System.out.println(2);
        } catch (NumberFormatException e) {
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);
        }
    }
}

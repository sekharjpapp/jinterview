package com.pixel.finallysample;

public class FinallySample {
    public static void main(String[] args) {
        try {
            //Runtime.getRuntime().halt(0);
            while (true) {
                System.out.println("In try block");
                throw new RuntimeException();
            }
        } catch (Exception e) {
            System.out.println("In catch block: " + e.getMessage());
        } finally {
            System.out.println("In finally block");
        }
    }
}

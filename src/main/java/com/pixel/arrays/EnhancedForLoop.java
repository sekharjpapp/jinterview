package com.pixel.arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int index  =0;
        for (int num:numbers) {
            System.out.println(" index " + index + ", Elements " + num);
            index++;
        }
    }
}

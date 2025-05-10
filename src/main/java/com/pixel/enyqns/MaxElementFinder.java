package com.pixel.enyqns;

public class MaxElementFinder {
    public static void main(String[] args) {
        int[] arr = {10, 45, 7, 99, 65, 22};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        //System.out.println(max);

        System.out.println(maxElement(arr));
    }
    public static int maxElement(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

package com.pixel.dsa;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        getElement(arr, target);
    }
    private static int getElement(int[] arr, int target) {
        boolean found = false;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
            return -1;
        }
        return target;
    }
}

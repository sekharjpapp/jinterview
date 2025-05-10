package com.pixel.frqaskedquestion;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        findCommonElements(arr1, arr2);
    }
    public static void findCommonElements(int[] arr1, int[] arr2) {
        for (int num : arr1) {
            for (int num2 : arr2) {
                if (num == num2) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}

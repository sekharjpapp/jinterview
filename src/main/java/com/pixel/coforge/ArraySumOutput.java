package com.pixel.coforge;

public class ArraySumOutput {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                //   0 , 1,2, 3, 4, 5, 6, 7, 8
        int left = 0; // Start pointer
        int right = arr.length - 1; // End pointer

        while (left <= right) {
            while (left <= right) {
                int sum;
                if (left == right) {
                    // Handle the middle element
                    sum = arr[left];
                    System.out.println("Sum of arr[" + left + "] = " + sum);
                } else {
                    // Handle pairs
                    sum = arr[left] + arr[right];
                    System.out.println("Sum of arr[" + left + "] + arr[" + right + "] = " + sum);
                }
                left++;
                right--;
            }
        }
    }
}

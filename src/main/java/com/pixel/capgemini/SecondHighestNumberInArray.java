package com.pixel.capgemini;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumberInArray {
    public static void main(String[] args) {

        int[] arr = {10, 45, 7, 99, 65, 22};
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
        System.out.println("Second maximum: " + findSecondMax(arr));
    }
    public static int findSecondMax(int[] arr) {
        Integer integer = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        return integer;
    }
}

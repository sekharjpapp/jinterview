package com.pixel.hashmapqna;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {10, 20, 30, 40, 50};
        unionOfTwoArrays(arr1, arr2);
    }
    private static void unionOfTwoArrays(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>(); // <Integer>

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
}

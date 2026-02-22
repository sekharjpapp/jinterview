package com.pixel.j8only;

import java.util.LinkedList;

public class ZerosAnsOnesSample {
    public static void main(String[] args) {
        //int[] arr = {1,1,0,0,1,0,1,1,0};
        int[] arr = {2,3,0,0,4,0,5,6,0};
        getSegregateOutcome(arr);
    }
    public static void getSegregateOutcome(int[] arr) {
        LinkedList<Integer> integerList = new LinkedList<>();
        for (int j : arr) {
            if (j == 0) {
                integerList.addFirst(j);
            } else {
                integerList.addLast(j);
            }
        }
        System.out.println(integerList);
    }
}

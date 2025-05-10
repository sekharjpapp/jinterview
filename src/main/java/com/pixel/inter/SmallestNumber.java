package com.pixel.inter;

import java.util.Stack;

public class SmallestNumber {
    public static void main(String[] args) {
        //5,6,9,25, 1, 3,5
        int[] arr = {5,6,9,25, 1, 3,5};

        smallestNumber(arr);
    }

    private static void smallestNumber(int[] arr) {
        int minNum = Integer.MAX_VALUE;

        for (int min: arr){
            if (min < minNum){
                minNum = min;
            }
        }
        System.out.println(minNum);
    }

   /* public static boolean validParanehesis(String str) {
        char[] charArray = str.toCharArray();
        Stack<String> strings = new Stack<>();
        if (charArray.length ){
            return
        }
        int low; int mid;int high;
        if (charArray ) {

        }
        return null;
    }*/
}

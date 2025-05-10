package com.pixel.arrays;

public class SampleMinMax {
    public static void main(String[] args) {

        String str = "APHYD15115880000010037";
        System.out.println(str.length());

        int[] arr = {5,6,9,25, 1, 3,5};
        int min = Integer.MAX_VALUE;
        for (int i= 0; i<=arr.length-1; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<=arr.length-1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

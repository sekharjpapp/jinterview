package com.pixel.coforge;

public class SortColors {
    public static void main(String[] args) {

    }

    public static void sortColors(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int index = 0;
        while (index <=end) {
            if (arr[index]==0){
                swap(arr,index,start);
                index++;
                start++;
            }
        }
    }

    public static void swap(int[] nums, int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

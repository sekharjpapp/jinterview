package com.pixel.persistentsystem;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int num = 1234;
        String maxNumStr = getMaxNum(num);
        int maxNum = Integer.parseInt(maxNumStr);
        int digitSum = getDigitSum(maxNum);

        System.out.println("Maximum Number: " + maxNum);
        System.out.println("Sum of Digits: " + digitSum);
    }
    // Form maximum number by rearranging digits
    public static String getMaxNum(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars)).reverse().toString();
    }

    // Calculate sum of digits
    public static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

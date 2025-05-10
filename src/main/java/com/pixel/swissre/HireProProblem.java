package com.pixel.swissre;

import java.util.Arrays;

public class HireProProblem {
    public static void main(String[] args) {

        int[] numbers = {678, 234, 678, 677, 765};

        // Assuming you want to calculate the sum after removing min and max digits
        int sum = Arrays.stream(numbers)
                .mapToObj(Integer::toString)
                .mapToInt(HireProProblem::getNumberAfterRemovingMinAndMax)
                .sum();

        System.out.println(sum);

        // Alternative method for getting sum using getCheckSum
        int checkSum = getCheckSum(numbers.length, numbers);
        System.out.println(checkSum);
    }

    // Method to remove the min and max digits and return the sum of remaining digits
    public static int getNumberAfterRemovingMinAndMax(String number) {
        char[] digits = number.toCharArray();
        Arrays.sort(digits);
        int middleSum = 0;
        // Skip the first (min) and last (max) digits
        for (int i = 1; i < digits.length - 1; i++) {
            middleSum += Character.getNumericValue(digits[i]);
        }
        return middleSum;
    }

    // Alternative method for calculating the sum (or checksum)
    public static int getCheckSum(int length, int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

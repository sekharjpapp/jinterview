package com.pixel.arrays.anuj;

public class BasicArraySample {
    public static void main(String[] args) {
        String [] names = { "Anuj","Ankush","Ankita","Anjali" };
        // min number from array
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int i = 0; i <names.length; i++) {
            System.out.println(i);
        }
        for (String name: names) {
            System.out.println(name);
        }
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Minimum number in the array: " + min);

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > firstMax) {
                // Update both first and second max
                secondMax = firstMax;
                firstMax = number;
            } else if (number > secondMax && number != firstMax) {
                // Update only second max
                secondMax = number;
            }
        }

        System.out.println("Second highest number in the array: " + secondMax);
        getNumbers(5);
    }
    public static void getNumbers(int num) {
        if (num == 0 ) {
            return;
        }
        getNumbers(num - 1);
        System.out.println(num);
    }
}

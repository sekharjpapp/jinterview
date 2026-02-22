package com.pixel.j8only;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,4,5,5,6,6,7,8, 8, 9};
        int missingNumber = findMissingNumber(numbers);
        System.out.println("The missing number is: " + missingNumber);
        OptionalInt missingNumberJava8 = findMissingNumberJava8(numbers);
        System.out.println("The missing number using Java 8 is: " + missingNumberJava8);
    }
    public static int findMissingNumber(int[] numbers) {
        Set<Integer> numberSet = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        for (int i = 1; i <= numbers.length; i++) {
            if (!numberSet.contains(i)) {
                return i;
            }
        }
        int n = numbers.length + 1; // Since one number is missing
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }
    public static OptionalInt findMissingNumberJava8(int[] numbers) {

        Set<Integer> numberSet = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toSet());

        return IntStream.rangeClosed(1, 9)
                .filter(i -> !numberSet.contains(i))
                .findFirst();
    }

}

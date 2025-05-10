package com.pixel.general;

import java.util.Arrays;
import java.util.List;

public class SumofSqures {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        int sum = integerList.stream().mapToInt(nums -> nums * nums).sum();
        System.out.println(sum);
    }
}

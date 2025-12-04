package com.pixel.morganstanley;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorSample {
    public static void main(String[] args) {
        Comparator<Integer> numberComparator = (number1, number2) -> number2.compareTo(number1);
        Integer arr[] = {1, 4, 2, 3};
        Arrays.sort(arr, numberComparator);
        for (Integer num : arr) {
            System.out.println(num + " ");

        }
        List<String> list = new ArrayList<>();

        for (int i=0; i<100; i++) {
            list.add("Item " );
        }
        System.out.println(list.size());

    }
}

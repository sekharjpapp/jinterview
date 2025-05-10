package com.pixel.general;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

 */
public class FilterWithStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenList = integerList.stream()
                .filter(nums -> nums % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenList);
    }
}

package com.pixel.j8highestlengthstr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ZeroFirstStream {
    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 0, 8, 0};

        Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x -> x == 0));

        List<Integer> list = new ArrayList<>();
        list.addAll(collect.get(false));
        list.addAll(collect.get(true));

        System.out.println(list);
    }
}

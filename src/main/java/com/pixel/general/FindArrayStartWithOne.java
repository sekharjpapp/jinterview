package com.pixel.general;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindArrayStartWithOne {
    public static void main(String[] args) {
        int[] nums = {5,9,11,2,8,21,1};

        List<String> stringList = Arrays.stream(nums)
                .boxed()
                .map(num -> num + "")
                .filter(s->s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}

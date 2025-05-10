package com.pixel.peoplsoft;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayDuplicate {
    public static void main(String[] args) {
        // Given a non-empty array of integers nums,
        // every element appears twice except for one.
        // Find that single one.
        //Input: nums = [2,2,1]
        //Output: 1
        int[] nums = {4,1,2,1,2,2};
        Optional<Integer> nonRepeated = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(nonRepeated);
        
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for (int num:nums) {
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        for (int num:nums) {
            if (frequencyMap.get(num) == 1){
                System.out.println("First non-repeating integer: " + num);
                return;
            }
        }
        System.out.println("No non-repeating integer found.");
    }

}

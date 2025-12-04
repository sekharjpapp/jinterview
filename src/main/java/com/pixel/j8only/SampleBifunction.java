package com.pixel.j8only;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class SampleBifunction {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(1,3,4,6,7,9,19).toList();
        List<Integer> list1 = Stream.of(11,3,43,6,7,19).toList();

       BiFunction<List<Integer>,List<Integer>,List<Integer>> uniqueMerger  = (l1, l2)-> Stream.of(list,list1)
               .flatMap(List::stream)
               .distinct()
               .sorted()
               .toList();
        Function<List<Integer>,List<Integer>> sortedList = (l1)->l1.stream().sorted().toList();
        List<Integer> integerList = uniqueMerger.andThen(sortedList).apply(list, list1);
        System.out.println(integerList);
    }
}

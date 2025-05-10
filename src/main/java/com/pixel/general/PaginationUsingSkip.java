package com.pixel.general;

import java.util.List;
import java.util.stream.IntStream;

public class PaginationUsingSkip {
    public static void main(String[] args) {
        var skipSize = 0;
        var pageSize = 4 ;
        var numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13);
        var numbers1 = IntStream.rangeClosed(1,15).boxed().toList();
        while (skipSize <= numbers1.size()) {
            numbers1.stream()
                    .skip(skipSize)
                    .limit(pageSize)
                    .forEach(System.out::println);
            skipSize += pageSize;
            System.out.println("-------------------");
        }
    }
}

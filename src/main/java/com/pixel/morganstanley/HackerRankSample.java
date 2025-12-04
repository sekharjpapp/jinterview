package com.pixel.morganstanley;

import java.util.Arrays;

public class HackerRankSample {
    public static void main(String[] args) {
        int sum = Arrays.stream(new int[] {1,2,3,4,5})
                .filter(i->i % 2 == 0 )
                .map(i->i*2)
                .sum();
        System.out.println(sum);

    }
}

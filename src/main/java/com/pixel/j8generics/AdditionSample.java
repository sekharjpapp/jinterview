package com.pixel.j8generics;

import java.util.function.BinaryOperator;

public class AdditionSample {
    public static void main(String[] args) {
        System.out.println(add(3, 4, Integer::sum));
        System.out.println(add(3L, 44L, Long::sum));
        System.out.println(add(3.4, 4.5, Double::sum));
        System.out.println(add(3.45f, 4.55f, Float::sum));
        
    }
    static <T> T add(T a, T b, BinaryOperator<T> op) {
        return op.apply(a,b);
    }
}


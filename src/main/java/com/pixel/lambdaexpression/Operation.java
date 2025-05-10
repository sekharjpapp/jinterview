package com.pixel.lambdaexpression;

@FunctionalInterface
public interface Operation<T> {
    T operate(T vale1, T value2);
}

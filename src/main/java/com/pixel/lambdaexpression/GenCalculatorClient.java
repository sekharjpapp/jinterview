package com.pixel.lambdaexpression;

public class GenCalculatorClient {
    public static void main(String[] args) {
        Integer calculator = calculator((a, b) -> a + b, 1, 2);
        System.out.println(calculator);
        Double result2 = calculator((a, b) -> a / b, 1.0, 2.0);
        System.out.println(result2);
        var result3 = calculator((a, b) -> a.toUpperCase() + " " +b.toUpperCase(), "Tom", "jerry");
        System.out.println(result3);
    }
    public static <T> T calculator(Operation<T> operation, T value1, T value2) {
        T result = operation.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }
}

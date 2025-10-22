package com.pixel.jpmc;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenoddPrinter {
    private static Object object = new Object();
    private static IntPredicate evenCondition = num -> num % 2 == 0;
    private static IntPredicate oddCondition = num -> num % 2 != 0;
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(()-> printNumbers(oddCondition));
        CompletableFuture.runAsync(()-> printNumbers(evenCondition));
        Thread.sleep(1000);
    }
    public static void printNumbers(IntPredicate condition) {
        IntStream.rangeClosed(1, 10).filter(condition).forEach(EvenoddPrinter::execute);
    }
    public static void execute(int num) {
        synchronized (object) {
            try {
                System.out.println(Thread.currentThread().getName() + " : " + num);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

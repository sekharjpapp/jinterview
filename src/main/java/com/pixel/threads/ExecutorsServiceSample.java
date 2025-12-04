package com.pixel.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsServiceSample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);

        Future<List<Integer>> feature1 = service.submit(() -> {
            // api call or db call
            System.out.println("Thread " + Thread.currentThread().getName() + " is running task 1");
            try {
                System.out.println(10/0);
            }catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
            return Arrays.asList(1, 2, 3, 4, 5);
        });

        Future<List<Integer>> feature2 = service.submit(() -> {
            // api call or db call
            System.out.println("Thread " + Thread.currentThread().getName() + " is running task 1");
            return Arrays.asList(1, 2, 3, 4, 5);
        });
        Future<List<Integer>> feature3 = service.submit(() -> {
            // api call or db call
            System.out.println("Thread " + Thread.currentThread().getName() + " is running task 1");

            return Arrays.asList(1, 2, 3, 4, 5);
        });
        List<Integer> list = feature1.get();
        System.out.println(list);
        service.shutdown();
    }
}

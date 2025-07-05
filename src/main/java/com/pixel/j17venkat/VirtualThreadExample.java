package com.pixel.j17venkat;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExample {
    public static void main(String[] args) throws Exception {
        /*try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

            List<String> tasks = List.of("task1", "task2", "task3");

            for (String task : tasks) {
                executor.submit(() -> {
                    System.out.println("Running " + task + " on " + Thread.currentThread());
                    Thread.sleep(1000); // Simulate work
                    return null;
                });
            }
        }*/

        System.out.println("All tasks submitted.");
        Thread.sleep(2000); // wait for tasks to complete (only for demo)
    }
}

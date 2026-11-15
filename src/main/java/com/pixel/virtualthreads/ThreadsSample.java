package com.pixel.virtualthreads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadsSample {
    static void main() throws InterruptedException {

        var MAX = 10;
        var executors = Executors.newVirtualThreadPerTaskExecutor();

        for (var i=0; i<MAX; i++) {
            var index = i;
            executors.submit(()-> doWork(index));
        }
        executors.shutdown();
        executors.awaitTermination(10, TimeUnit.SECONDS);

        var threads = new ArrayList<>();

        for (var i =0; i< 1_100; i++) {

            /*var t = new Thread(new Runnable() {
                @Override
                public void run() {

                }
            });*/
            var thread = Thread.ofPlatform().unstarted(new Runnable() {
                @Override
                public void run() {

                }
            });
            threads.add(thread);
        }
    }

    private static void doWork(int index) {
        try {
            System.out.println(index+ " entering " + Thread.currentThread());
            var result = Files.lines(Path.of("ThreadsSample.java")).count();
            System.out.println(index+ " exiting " + Thread.currentThread() + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

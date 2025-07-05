package com.pixel.stopwatchRecord;

import java.time.Duration;
import java.time.Instant;

public class RecordStopWatch {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Not found
    }
    public static void main(String[] args) {
        var sw = StopWatch.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sw.stop();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i; // filling array with values 0 to 99999
        }

        int target = 99999; // Value to search for

        var sw1 = StopWatch.start(); // Start stopwatch

        int index = linearSearch(arr, target); // Perform linear search

        sw1.stop(); // Stop stopwatch and print duration

        System.out.println("Element found at index: " + index);

    }
}
record StopWatch(Instant begin){
    static StopWatch start(){
        return new StopWatch(Instant.now());
    }
    void stop(){
        var end = Instant.now();
        var duration = Duration.between(this.begin,end);
        //System.out.println(duration);
        System.out.println("Execution time: " + duration.toMillis() + " ms");
    }
}

package com.pixel.hashmapqna;

import java.util.HashMap;
import java.util.Map;

public class NumberCountFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        countFrequency(arr);
    }
    public static void countFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(); // <Integer>
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n/3) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}

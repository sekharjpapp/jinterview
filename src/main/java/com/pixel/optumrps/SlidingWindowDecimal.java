package com.pixel.optumrps;

import java.util.*;

public class SlidingWindowDecimal {
    private static final int WINDOW_SIZE = 3;

    public static void main(String[] args) {
        // 👇 Simulating an ArrayList of incoming data
        List<CustomerLineProperty> list = new ArrayList<>();
        list.add(new CustomerLineProperty(1.1, 5000.22));
        list.add(new CustomerLineProperty(1.5, 5200.22));
        list.add(new CustomerLineProperty(1.8, 5300.22));
        list.add(new CustomerLineProperty(2.0, 5400.22));
        list.add(new CustomerLineProperty(1.2, 5100.22));
        list.add(new CustomerLineProperty(1, 5100));

        // 🔁 Sliding Window Queue
        Deque<CustomerLineProperty> window = new LinkedList<>();

        for (CustomerLineProperty clp : list) {
            if (window.size() == WINDOW_SIZE) {
                window.pollFirst(); // remove oldest
            }
            window.offerLast(clp); // add newest
        }

        // ✅ After loop, print only the last entry in the sliding window
        CustomerLineProperty lastUpdated = window.peekLast();
        System.out.println("Last Updated (from Sliding Window): " + lastUpdated);
    }
}

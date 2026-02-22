package com.pixel.singletontocreate;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Tripleton {
    public static void main(String[] args) {
        System.out.println("=== Testing Tripleton Hash Codes ===");

        // Get instances
        Tripleton t1 = Tripleton.getInstance();
        Tripleton t2 = Tripleton.getInstance();
        Tripleton t3 = Tripleton.getInstance();
        Tripleton t4 = Tripleton.getInstance();

        // Print hash codes
        System.out.println("t1 hash code: " + System.identityHashCode(t1));
        System.out.println("t2 hash code: " + System.identityHashCode(t2));
        System.out.println("t3 hash code: " + System.identityHashCode(t3));
        System.out.println("t4 hash code: " + System.identityHashCode(t4));

        // Using hashCode() method (might be overridden)
        System.out.println("\nUsing hashCode() method:");
        System.out.println("t1.hashCode(): " + t1.hashCode());
        System.out.println("t2.hashCode(): " + t2.hashCode());
        System.out.println("t3.hashCode(): " + t3.hashCode());
        System.out.println("t4.hashCode(): " + t4.hashCode());

    }
    // Queue to hold the 3 instances
    private static final BlockingQueue<Tripleton> instances = new LinkedBlockingQueue<>();
    private static final AtomicInteger counter = new AtomicInteger(0);
    private static final int MAX_INSTANCES = 3;

    private final int id;

    static {
        // Initialize the 3 instances
        for (int i = 0; i < MAX_INSTANCES; i++) {
            instances.add(new Tripleton(i + 1));
        }
    }

    private Tripleton(int id) {
        this.id = id;
        System.out.println("Tripleton instance " + id + " created");
    }

    public static Tripleton getInstance() {
        try {
            // Take an instance from the queue (blocks if none available)
            Tripleton instance = instances.take();
            // Return it to the end of the queue for reuse
            instances.offer(instance);
            return instance;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Failed to get Tripleton instance", e);
        }
    }

    public static Tripleton getInstanceById(int id) {
        if (id < 1 || id > MAX_INSTANCES) {
            throw new IllegalArgumentException("ID must be between 1 and " + MAX_INSTANCES);
        }

        Tripleton result = null;
        // Rotate through the queue to find the instance with the requested ID
        for (int i = 0; i < MAX_INSTANCES; i++) {
            Tripleton instance = getInstance();
            if (instance.getId() == id) {
                result = instance;
                break;
            }
        }
        return result;
    }

    public int getId() {
        return id;
    }

    public void doSomething() {
        System.out.println("Tripleton instance " + id + " is doing something");
    }

    public static int getInstanceCount() {
        return MAX_INSTANCES;
    }
}

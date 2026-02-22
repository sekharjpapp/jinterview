package com.pixel.singletontocreate;

import java.util.ArrayList;
import java.util.List;

public class LimitedInstance {
    private static final int MAX_INSTANCES = 3;
    private static final List<LimitedInstance> instances = new ArrayList<>();

    private static int index = 0;

    // private constructor
    private LimitedInstance() {
    }

    public static synchronized LimitedInstance getInstance() {
        if (instances.size() < MAX_INSTANCES) {
            instances.add(new LimitedInstance());
        }
        LimitedInstance instance = instances.get(index);
        index = (index + 1) % MAX_INSTANCES;
        return instance;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            LimitedInstance obj = LimitedInstance.getInstance();
            System.out.println("Instance " + i + " : " + obj.hashCode());
        }

    }
}

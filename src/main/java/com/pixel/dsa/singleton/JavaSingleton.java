package com.pixel.dsa.singleton;

public class JavaSingleton {

    private static JavaSingleton instance;

    private JavaSingleton() {
        System.out.println("Constructor called");
    }

    public static JavaSingleton getInstance() {
        if (instance == null) {
            instance = new JavaSingleton();
        }
        return instance;
    }
}

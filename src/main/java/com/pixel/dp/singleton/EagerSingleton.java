package com.pixel.dp.singleton;

public class EagerSingleton {
    private static EagerSingleton instance;
    private EagerSingleton() { }
    public static EagerSingleton getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        EagerSingleton  instance = EagerSingleton.getInstance();
        System.out.println(instance.hashCode());
        EagerSingleton instance1 = EagerSingleton.getInstance();
        System.out.println(instance1.hashCode());
    }
}

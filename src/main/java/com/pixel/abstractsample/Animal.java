package com.pixel.abstractsample;

public abstract class Animal {

    int age;
    String name;

    public abstract void makeNoise();

    public void printName() {
        System.out.println("My Name is: " +name);
    }
}

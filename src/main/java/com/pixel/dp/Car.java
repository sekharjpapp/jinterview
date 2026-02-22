package com.pixel.dp;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving a Car");
    }

    @Override
    public int getWheels() {
        return 4;
    }
}


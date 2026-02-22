package com.pixel.dp;

public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Riding a Bike");
    }

    @Override
    public int getWheels() {
        return 2;
    }
}


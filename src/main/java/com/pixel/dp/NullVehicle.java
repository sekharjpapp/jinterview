package com.pixel.dp;

public class NullVehicle implements Vehicle {

    @Override
    public void drive() {
        System.out.println("No vehicle available to drive");
    }

    @Override
    public int getWheels() {
        return 0;
    }
}


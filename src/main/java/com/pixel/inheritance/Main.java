package com.pixel.inheritance;

// Inheritance
//. Creates a subtype relationship
//. Relationship is static
//. Members pulled in automatically
public class Main {
    private static void drive(Vehicle vehicle) {
        vehicle.makeEngineSound();
        vehicle.accelerate();
        vehicle.accelerate();
        System.out.println(vehicle.getSpeed());
    }

    public static void main(String[] args) {
        RaceCar raceCar = new RaceCar(2.0);
        drive(raceCar);
    }
}

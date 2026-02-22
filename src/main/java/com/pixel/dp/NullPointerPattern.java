package com.pixel.dp;

public class NullPointerPattern {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("CAR");
        car.drive();
        System.out.println("Wheels: " + car.getWheels());

        Vehicle bike = VehicleFactory.getVehicle("BIKE");
        bike.drive();

        Vehicle unknown = VehicleFactory.getVehicle("TRUCK");
        unknown.drive(); // No NullPointerException
    }
}

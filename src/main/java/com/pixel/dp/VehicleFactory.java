package com.pixel.dp;

public class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if (type == null) {
            return new NullVehicle();
        }

        return switch (type.toUpperCase()) {
            case "CAR" -> new Car();
            case "BIKE" -> new Bike();
            default -> new NullVehicle();
        };
    }
}


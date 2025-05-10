package com.pixel.designpatterns.factory;

public class ComputerFactory {

    public static Computer createComputer(String type,String ram,String hdd, String cpu, boolean graphicsEnabled,boolean bluetoothEnabled  ) {
        if ("PC".equalsIgnoreCase(type)){
            return new PC(ram, hdd, cpu, graphicsEnabled, bluetoothEnabled);
        } else if ("Laptop".equalsIgnoreCase(type)) {
            return new LapTop(ram, hdd, cpu, graphicsEnabled, bluetoothEnabled);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu, graphicsEnabled, bluetoothEnabled);
        }
        throw new IllegalArgumentException("Unknown computer type: " + type);

    }
}

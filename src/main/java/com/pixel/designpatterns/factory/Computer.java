package com.pixel.designpatterns.factory;

public interface Computer {

    String ram();
    String hdd();
    String cpu();

    boolean isGraphicsEnabled();
    boolean isBluetoothEnabled();
}

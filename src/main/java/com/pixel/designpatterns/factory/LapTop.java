package com.pixel.designpatterns.factory;

public class LapTop implements Computer{
    private String ram;
    private String hdd;
    private String apu;
    private boolean graphicsEnabled;
    private boolean bluetoothEnabled;

    public LapTop(String ram, String hdd, String apu, boolean graphicsEnabled, boolean bluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.apu = apu;
        this.graphicsEnabled = graphicsEnabled;
        this.bluetoothEnabled = bluetoothEnabled;
    }
    @Override
    public String ram() {
        return ram;
    }

    @Override
    public String hdd() {
        return hdd;
    }

    @Override
    public String cpu() {
        return apu;
    }

    @Override
    public boolean isGraphicsEnabled() {
        return graphicsEnabled;
    }

    @Override
    public boolean isBluetoothEnabled() {
        return bluetoothEnabled;
    }
}

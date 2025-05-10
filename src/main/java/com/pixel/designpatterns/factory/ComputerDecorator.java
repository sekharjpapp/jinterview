package com.pixel.designpatterns.factory;

public class ComputerDecorator implements Computer{
    protected Computer decoratedComputer;

    public ComputerDecorator(Computer decoratedComputer) {
        this.decoratedComputer = decoratedComputer;
    }
    @Override
    public String ram() {
        return decoratedComputer.ram();
    }

    @Override
    public String hdd() {
        return decoratedComputer.hdd();
    }

    @Override
    public String cpu() {
        return decoratedComputer.cpu();
    }

    @Override
    public boolean isGraphicsEnabled() {
        return decoratedComputer.isGraphicsEnabled();
    }

    @Override
    public boolean isBluetoothEnabled() {
        return decoratedComputer.isBluetoothEnabled();
    }
}

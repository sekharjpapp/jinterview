package com.pixel.designpatterns.factory;

public class SecurityDecorator extends ComputerDecorator{
    public SecurityDecorator(Computer decoratedComputer) {
        super(decoratedComputer);
    }
    @Override
    public String toString() {
        return decoratedComputer.toString() + ", with Advanced Security";
    }
}

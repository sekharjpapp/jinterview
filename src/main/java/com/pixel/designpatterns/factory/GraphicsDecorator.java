package com.pixel.designpatterns.factory;

public class GraphicsDecorator extends ComputerDecorator{
    public GraphicsDecorator(Computer decoratedComputer) {
        super(decoratedComputer);
    }
    @Override
    public boolean isGraphicsEnabled() {
        // Adds or overrides the graphics capability
        return true; // Assume this decorator always enables graphics
    }

    @Override
    public String toString() {
        return decoratedComputer.toString() + ", with Enhanced Graphics";
    }
}

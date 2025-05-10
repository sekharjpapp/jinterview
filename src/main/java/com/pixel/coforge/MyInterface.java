package com.pixel.coforge;

public interface MyInterface {
    void performAction();
}
class A implements MyInterface {
    @Override
    public void performAction() {
        System.out.println("Action performed by Class A");
    }
}

class B implements MyInterface {
    @Override
    public void performAction() {
        System.out.println("Action performed by Class B");
    }
}

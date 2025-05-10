package com.pixel;

public class MethodOverriding {

}

class Parent {
    public void show() {
        System.out.println("Parent show");
    }
}
class Child extends Parent {
    @Override
    public void show() {  // This is valid
        System.out.println("Child show");
    }

    // Or you can also make it public

}
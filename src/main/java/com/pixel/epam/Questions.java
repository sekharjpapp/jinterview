package com.pixel.epam;

import java.io.IOException;

public class Questions {
    public static void main(String[] args) {

    }
}
class Parent {
    void m1() throws IOException {
        System.out.println("hehe");
    }
}
class Child extends Parent {
    // The overridden method cannot throw a broader exception than IOException

    void m1() {
        System.out.println("hehe");
    }
}

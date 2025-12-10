package com.pixel.javapoly;

public class StaticMethodsHiding {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display(); // Calls Parent's static method

    }
}
class Parent {
    static void display() {
        System.out.println("Static method in Parent class");
    }
}
class Child extends Parent {
    static void display() {
        System.out.println("Static method in Child class");
    }
}
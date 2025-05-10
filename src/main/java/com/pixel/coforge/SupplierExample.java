package com.pixel.coforge;

import java.util.function.Supplier;

/*
*
* Ex: I have one interface , implemented by A, B classes how supplier will supply the classes dynamically when we pass the flag argument

write a sample code above suppler example
* */

public class SupplierExample {
    public static void main(String[] args) {
        // Using a flag to decide which class to instantiate
        boolean flag = false; // Set to false to use Class B

        // Supplier that supplies an instance of MyInterface based on the flag
        Supplier<MyInterface> supplier = flag ? A::new : B::new;

        // Get the instance based on the flag and perform action
        MyInterface instance = supplier.get();
        instance.performAction(); // Prints action from Class A or B based on the flag
    }
}

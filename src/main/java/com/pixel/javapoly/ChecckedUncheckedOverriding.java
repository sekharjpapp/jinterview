package com.pixel.javapoly;

import java.io.IOException;

public class ChecckedUncheckedOverriding {
    public static void main(String[] args) {
        ParentClass parent = new ChildClass();
        try {
            parent.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class ParentClass {
    void show() throws IOException {} // Checked exception
}
class ChildClass extends ParentClass {
    @Override
    void show() throws RuntimeException {} //
}

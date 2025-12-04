package com.pixel.javapoly;

public class OverloadingOverriding {
    public static void main(String[] args) {
        OverloadingOverriding obj = new OverloadingOverriding();
        //obj.method(null); // Calls the most specific overloaded method
        obj.method(10);
    }
    public void method(Object obj) {
        System.out.println("Object parameter");
    }
    public void method(Integer integer) {
        System.out.println("Integer parameter");
    }
}


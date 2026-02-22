package com.pixel.dsa.singleton;

import java.lang.reflect.Constructor;

public class BreakSingleton {
    public static void main(String[] args) throws Exception {

        JavaSingleton obj1 = JavaSingleton.getInstance();

        Constructor<JavaSingleton> constructor =
                JavaSingleton.class.getDeclaredConstructor();

        constructor.setAccessible(true);
        JavaSingleton obj2 = constructor.newInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}

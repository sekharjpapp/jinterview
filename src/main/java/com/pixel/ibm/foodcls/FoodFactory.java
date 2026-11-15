package com.pixel.ibm.foodcls;

import java.util.function.Supplier;

/** Creates Food instances from a name string. */
public final class FoodFactory {

    private FoodFactory() { }

    public static Food create(String name) {
        return switch (name) {
            case "Bread" -> new Bread(4, 1.1, 13.8);
            case "Egg"   -> new Egg(6, 6.3, 5.3, 0.6);
            default      -> throw new IllegalArgumentException(
                    "Unknown food: " + name);
        };
    }
}

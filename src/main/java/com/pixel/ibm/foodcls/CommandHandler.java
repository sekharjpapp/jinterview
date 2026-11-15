package com.pixel.ibm.foodcls;

/**
 * Handles one command for a given food, returning the output line(s).
 * Kept separate from parsing so the main loop stays tiny.
 */
public final class CommandHandler {

    private CommandHandler() { }

    public static String handle(Food food, String command) {
        return switch (command) {
            case "getMacros" -> food.macroNutrients();
            case "getTaste"  -> "Taste: " + food.tastyScore();
            case "getType"   -> food.type() + " is " + food.type();
            default          -> "Unknown command: " + command;
        };
    }
}

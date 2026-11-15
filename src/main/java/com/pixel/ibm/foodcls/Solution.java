package com.pixel.ibm.foodcls;

import java.util.Scanner;

public class Solution {

    private static final int COMMANDS_PER_FOOD = 3;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;

            int cnt = Integer.parseInt(sc.nextLine().trim());
            StringBuilder out = new StringBuilder();

            for (int i = 0; i < cnt; i++) {
                String name = sc.nextLine().trim();
                Food food = FoodFactory.create(name);

                for (int j = 0; j < COMMANDS_PER_FOOD; j++) {
                    if (!sc.hasNextLine()) break;
                    String command = sc.nextLine().trim();
                    out.append(CommandHandler.handle(food, command)).append('\n');
                }
            }

            // Single System.out call — cheaper than many small prints.
            System.out.print(out);
        }
    }
}

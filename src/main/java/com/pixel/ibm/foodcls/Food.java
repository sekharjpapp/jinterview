package com.pixel.ibm.foodcls;

public sealed interface Food permits Bread, Egg {

    int tastyScore();

    String type();

    String macroNutrients();

    /**
     * Shared helper — nested types are accessible to implementors.
     */
    final class Fmt {
        private Fmt() {
        }

        public static String macros(String... pairs) {
            return String.join(", ", pairs);
        }
    }
}
    // ---------- Record: Bread ----------
    record Bread(int tastyScore, double carb, double fat) implements Food {
        public Bread {
            if (tastyScore < 0) throw new IllegalArgumentException("tastyScore must be >= 0");
        }

        @Override public String type() { return "Bread"; }

        @Override
        public String macroNutrients() {
            return Fmt.macros(
                    "Carbs: " + carb,
                    "Fat: "   + fat
            );
        }
    }

    // ---------- Record: Egg ----------
    record Egg(int tastyScore, double protein, double fat, double cholesterol) implements Food {

        @Override public String type() { return "Egg"; }

        @Override
        public String macroNutrients() {
            return Fmt.macros(
                    "Protein: "     + protein,
                    "Fat: "         + fat,
                    "Cholesterol: " + cholesterol
            );
        }
    }
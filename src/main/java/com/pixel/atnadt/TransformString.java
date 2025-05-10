package com.pixel.atnadt;

public class TransformString {
    public static void main(String[] args) {
        String str = "this was my name here";
        String result = transformString(str);
        System.out.println(result);
    }
    // Input- this was my name here
    //Output- ThiS WaS MY NamE HerE

    public static String transformString(String str) {
        String[] words = str.split(" ");  // Split the string into words
        StringBuilder transformed = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                // Capitalize first and last letter, make the rest lowercase
                transformed.append(Character.toUpperCase(word.charAt(0)))   // First letter capitalized
                        .append(word.substring(1, word.length() - 1).toLowerCase())  // Middle letters lowercase
                        .append(Character.toUpperCase(word.charAt(word.length() - 1))); // Last letter capitalized
            } else {
                // If the word is just one character, capitalize it
                transformed.append(Character.toUpperCase(word.charAt(0)));
            }
            transformed.append(" ");  // Add a space after each word
        }

        return transformed.toString().trim();  // Convert StringBuilder to string and trim any trailing space
    }
}

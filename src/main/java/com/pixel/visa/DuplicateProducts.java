package com.pixel.visa;

import java.util.*;

public class DuplicateProducts {
    public static void main(String[] args) {
        String[] name = {"ball", "bat", "glove", "glove", "glove"};
        int[] price = {2, 3, 1, 2, 1};
        int[] weight = {2, 5, 1, 1, 1};

        System.out.println("Duplicate Products Count = " + countDuplicates(name, price, weight));
    }

    public static int countDuplicates(String[] name, int[] price, int[] weight) {
        Map<String, Integer> productMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            // Unique key by combining all fields
            String key = name[i] + "-" + price[i] + "-" + weight[i];
            productMap.put(key, productMap.getOrDefault(key, 0) + 1);
        }

        int duplicates = 0;
        for (int count : productMap.values()) {
            if (count > 1) {
                duplicates += (count - 1); // extra occurrences are duplicates
            }
        }
        return duplicates;
    }
}

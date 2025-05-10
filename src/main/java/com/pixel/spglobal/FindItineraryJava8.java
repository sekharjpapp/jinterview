package com.pixel.spglobal;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindItineraryJava8 {
    public static void main(String[] args) {
        Map<String, String> dataSet = new HashMap<>();
        dataSet.put("Chennai", "Banglore");
        dataSet.put("Bombay", "Delhi");
        dataSet.put("Goa", "Chennai");
        dataSet.put("Delhi", "Goa");
        printResult(dataSet);
    }
    private static Map<String, String> printResult(Map<String, String> dataSet) {
        // To store reverse of given map
        //Map<String, String> reverseMap = new HashMap<>();
        Map<String, String> reverseMap  = dataSet.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        System.out.println(reverseMap );
        // To find the starting point of the itinerary
        String start = findStartingPoint(dataSet, reverseMap);
        // Print the itinerary
        System.out.println("Itinerary:");
        while (start != null) {
            System.out.print(start + " -> ");
            start = dataSet.get(start);
        }
        System.out.println("End");

        return reverseMap;
    }
    private static String findStartingPoint(Map<String, String> dataSet, Map<String, String> reverseMap) {
        for (String key : dataSet.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key; // Found the starting point
            }
        }
        return null; // No valid starting point found
    }
}

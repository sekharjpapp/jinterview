package com.pixel.leetcode;

import java.util.*;

public class ItineraryReconstructor {

    public static void main(String[] args) {
        // Input list of flights
        Map<String, String> flights = new HashMap<>();
        flights.put("Chennai", "Banglore");
        flights.put("Bombay", "Delhi");
        flights.put("Goa", "Chennai");
        flights.put("Delhi", "Goa");

        // Function call to print the itinerary
        printItinerary(flights);
    }

    public static void printItinerary(Map<String, String> flights) {
        // Create a set to store all destination cities
        Set<String> destinationCities = new HashSet<>(flights.values());

        // Find the starting city (a city not present in the destination set)
        String startCity = null;
        for (String city : flights.keySet()) {
            if (!destinationCities.contains(city)) {
                startCity = city;
                break;
            }
        }

        // If starting city is found, reconstruct and print the itinerary
        if (startCity != null) {
            String currentCity = startCity;
            while (currentCity != null) {
                String nextCity = flights.get(currentCity);
                if (nextCity != null) {
                    System.out.print(currentCity + " -> " + nextCity);
                    if (flights.get(nextCity) != null) {
                        System.out.print(", ");
                    }
                }
                currentCity = nextCity;
            }
        } else {
            System.out.println("Invalid input: No valid starting point found.");
        }
    }
}

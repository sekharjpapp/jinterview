package com.pixel.coforge.plbm;

import java.util.ArrayList;
import java.util.List;

public class DiscountCalculator {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        // Define discount ranges
        calculator.addDiscountRange(0, 200, 10);     // 10% for 0 - 200
        calculator.addDiscountRange(201, 400, 30);  // 30% for 201 - 400
        calculator.addDiscountRange(401, Integer.MAX_VALUE, 40); // 40% for above 400

        // Test amounts
        int[] testAmounts = {150, 250, 350, 450, 500};

        // Display results
        for (int amount : testAmounts) {
            int discountedAmount = calculator.calculateDiscount(amount);
            System.out.println("Original Amount: ₹" + amount);
            System.out.println("Discounted Amount: ₹" + discountedAmount);
            System.out.println("------------------------");
        }
    }
    private final List<DiscountRange> discountRanges = new ArrayList<>();

    // Add discount ranges dynamically
    public void addDiscountRange(int lowerBound, int upperBound, int discountRate) {
        discountRanges.add(new DiscountRange(lowerBound, upperBound, discountRate));
    }

    // Calculate the discounted amount
    public int calculateDiscount(int amount) {
        for (DiscountRange range : discountRanges) {
            if (amount >= range.lowerBound && amount <= range.upperBound) {
                int discount = (amount * range.discountRate) / 100;
                return amount - discount;
            }
        }

        // Default case: if no range matches, return the original amount
        return amount;
    }
}

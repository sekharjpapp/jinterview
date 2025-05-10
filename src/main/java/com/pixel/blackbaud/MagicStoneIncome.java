package com.pixel.blackbaud;

import java.util.Scanner;

public class MagicStoneIncome {
    public static double maximumAverage(int N, int K, double[] A) {
        // Calculate total income
        double totalIncome = 0;
        for (double income : A) {
            totalIncome += income;
        }

        // Check if total income is zero
        if (totalIncome != 0) {
            // Adjust incomes to make total income zero
            double adjustment = totalIncome / N;
            for (int i = 0; i < N; i++) {
                A[i] -= adjustment;
            }
        }

        // Find the person with the minimum income
        double minIncome = Double.MAX_VALUE;

        for (double income : A) {
            if (income < minIncome) {
                minIncome = income;
            }
        }

        // Calculate maximum average income
        double maxAverage = minIncome + 2 * K;

        return Math.round(maxAverage * 10.0) / 10.0; // Round to one decimal place
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter value of K: ");
        int K = scanner.nextInt();

        double[] A = new double[N];

        System.out.println("Enter incomes of " + N + " people:");
        for (int i = 0; i < N; i++) {
            System.out.print("Person " + (i + 1) + ": ");
            A[i] = scanner.nextDouble();
        }

        double result = maximumAverage(N, K, A);

        System.out.println("Maximum Average Income: " + result);

        scanner.close();
    }
}

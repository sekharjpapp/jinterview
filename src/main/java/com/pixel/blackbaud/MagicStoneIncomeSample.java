package com.pixel.blackbaud;

public class MagicStoneIncomeSample {
    public static double maximumAverage(int N, int K, double[] incomes) {
        // Check if sum of incomes is zero
        double sum = 0;
        for (double income : incomes) {
            sum += income;
        }
        if (sum != 0) {
            // Adjust incomes to make sum zero
            double adjustment = sum / N;
            for (int i = 0; i < N; i++) {
                incomes[i] -= adjustment;
            }
        }

        // Find the person with the minimum income
        double minIncome = Double.MAX_VALUE;
        for (double income : incomes) {
            if (income < minIncome) {
                minIncome = income;
            }
        }

        // Calculate maximum average income
        double maxAverage = (minIncome + 2 * K) / 1.0;

        return Math.round(maxAverage * 10.0) / 10.0; // Round to one decimal place
    }

    public static void main(String[] args) {
        int N = 5;
        int K = 4;
        double[] incomes = {1, -3, 7, -5, 2};

        double result = maximumAverage(N, K, incomes);

        System.out.println("Maximum Average Income: " + result);
    }
}

package com.pixel.algoslidingwindowproblems;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int K = 3;
        System.out.println("Maximum sum of subarray of size " + K + " is: " + maxSumSubarray(arr, K));
    }
    // Function to find the maximum sum of a subarray of size K
    public static int maxSumSubarray(int[] arr, int K) {
        int maxSum, windowSum = 0;

        // Calculate the sum of the first window of size K
        for (int i = 0; i < K; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window from the second element to the last
        for (int i = K; i < arr.length; i++) {
            // Add the next element to the window and remove the first element
            windowSum += arr[i] - arr[i - K];
            // Update the maximum sum
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}

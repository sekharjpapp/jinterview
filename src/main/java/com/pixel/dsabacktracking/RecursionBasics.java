package com.pixel.dsabacktracking;

public class RecursionBasics {
    public static void main(String[] args) {
        solve(3);
    }
    public static void solve(int n) {
        // base case
        if (n == 0) {
            return;
        }
        // processing
        System.out.println(n);
        // recursive call
        solve(n - 1);
    }
}

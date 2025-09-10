package com.pixel.visa;

/*
* Problem Restated
We are given a string S of even length (only digits 0-9).
Split into two halves:
firstHalf = S[0 .. n/2 - 1]
secondHalf = S[n/2 .. n-1]
We want to make the first half an anagram of the second half by replacing digits.
One operation = replace any digit in the first half with any other digit.
Find the minimum number of operations needed.
* Example Walkthrough
* S = "123122"
firstHalf = "123"
secondHalf = "122"
Compare:
1 → same count (1 in both) → ok
2 → firstHalf has 1, secondHalf has 2 → need +1 more
3 → firstHalf has 1, secondHalf has 0 → need -1 (replace 3 with 2)
✅ Answer = 1 operation.
* */

public class AnagramOperations {
    public static void main(String[] args) {
        String s = "123122";
        System.out.println("Minimum operations = " + minChangesToMakeAnagram(s));
    }

    public static int minChangesToMakeAnagram(String s) {
        int n = s.length();
        int[] firstCount = new int[10];
        int[] secondCount = new int[10];

        // Count digits in first half
        for (int i = 0; i < n / 2; i++) {
            firstCount[s.charAt(i) - '0']++;
        }

        // Count digits in second half
        for (int i = n / 2; i < n; i++) {
            secondCount[s.charAt(i) - '0']++;
        }

        int changes = 0;
        // Compare counts
        for (int d = 0; d < 10; d++) {
            if (secondCount[d] > firstCount[d]) {
                changes += (secondCount[d] - firstCount[d]);
            }
        }

        return changes;
    }
}


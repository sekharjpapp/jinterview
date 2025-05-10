package com.pixel.globallogic;

public class SparseContains {
    public static void main(String[] args) {
        System.out.println(yesContains("", ""));
        System.out.println(yesContains("abcd", ""));
        System.out.println(yesContains("", "efg"));
        System.out.println(yesContains("aocuaaty", "cat"));
        System.out.println(yesContains("aocuaaty", "cAt"));
        System.out.println(yesContains("aocubbty", "cat"));
        //
        System.out.println("***********************************************");
        System.out.println(yesContainsNoFwdRule("", ""));
        System.out.println(yesContainsNoFwdRule("abcd", ""));
        System.out.println(yesContainsNoFwdRule("", "efg"));
        System.out.println(yesContainsNoFwdRule("aocuaaty", "cat"));
        System.out.println(yesContainsNoFwdRule("aocuaaty", "cAt"));
        System.out.println(yesContainsNoFwdRule("aocubbty", "cat"));
        System.out.println("-----------------------------------------------------");
        System.out.println(yesNoSequenceRule("", ""));
        System.out.println(yesNoSequenceRule("abcd", ""));
        System.out.println(yesNoSequenceRule("", "efg"));
        System.out.println(yesNoSequenceRule("aocuaaty", "cat"));
        System.out.println(yesNoSequenceRule("aocuaaty", "cAt"));
        System.out.println(yesNoSequenceRule("aocubbty", "cat"));

    }
    public static boolean yesContains(String sparsePhrase, String word) {
        // Check if either string is empty
        if (sparsePhrase.isEmpty() || word.isEmpty()) {
            return false;
        }

        // Convert both strings to lowercase for case-insensitive comparison
        String sparseLower = sparsePhrase.toLowerCase();
        String wordLower = word.toLowerCase();

        int wordIndex = 0;
        // Iterate through each character in the sparse phrase
        for (int i = 0; i < sparseLower.length() && wordIndex < wordLower.length(); i++) {
            if (sparseLower.charAt(i) == wordLower.charAt(wordIndex)) {
                wordIndex++;
            }
        }

        // Return true if all characters in the word were found in order
        return wordIndex == wordLower.length();
    }
    public static boolean yesContainsNoFwdRule(String sparsePhrase, String word) {
        // Check if either string is empty
        if (sparsePhrase.isEmpty() || word.isEmpty()) {
            return false;
        }
        // Convert both strings to lowercase for case-insensitive comparison
        String sparseLower = sparsePhrase.toLowerCase();
        String wordLower = word.toLowerCase();
        int wordIndex = 0;
        // Iterate through each character in the sparse phrase
        for (int i = 0; i < sparseLower.length() && wordIndex < wordLower.length(); i++) {
            if (sparseLower.charAt(i) != wordLower.charAt(wordIndex)) {
                wordIndex++;
            }
        }
        // Return true if all characters in the word were found in order
        return wordIndex == wordLower.length();
    }
    public static boolean yesNoSequenceRule(String sparsePhrase, String word) {
            // Check if either string is empty
            if (sparsePhrase.isEmpty() || word.isEmpty()) {
                return false;
            }

            // Convert both strings to lowercase for case-insensitive comparison
            String sparseLower = sparsePhrase.toLowerCase();
            String wordLower = word.toLowerCase();

            // Arrays to count character frequencies (assuming only a-z letters)
            int[] sparseCount = new int[26];
            int[] wordCount = new int[26];

            // Populate frequency counts for sparsePhrase
            for (char c : sparseLower.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    sparseCount[c - 'a']++;
                }
            }

            // Populate frequency counts for word
            for (char c : wordLower.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    wordCount[c - 'a']++;
                }
            }

            // Check if sparsePhrase has sufficient characters for the word
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > sparseCount[i]) {
                    return false;
                }
            }

            return true;
    }
}

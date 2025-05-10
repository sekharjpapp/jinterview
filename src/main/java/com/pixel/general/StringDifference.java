package com.pixel.general;

public class StringDifference {
    public static void main(String[] args) {
        String str = "abcd";
        String str1 = "abcde";
        char c = strDiff(str, str1);
        System.out.println(c);
    }
    public static char strDiff(String str, String str1) {
        int[] count = new int[26];
        for (char ch: str.toCharArray()){
            count[ch-'a']++;
        }
        for (char ch: str1.toCharArray()){
            count[ch-'a']--;
        }
        for (int i= 0; i<26; i++) {
            if (count[i] == -1) {
                return (char) (i + 'a');
            }
        }
        return ' ';
    }
}

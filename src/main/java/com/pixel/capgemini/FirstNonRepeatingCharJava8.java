package com.pixel.capgemini;

public class FirstNonRepeatingCharJava8 {
    public static void main(String[] args) {

        String str = "success";
        str.chars().filter(c -> str.indexOf(c) == str.lastIndexOf(c)).forEach(System.out::println);

        int one = 1;
        String two = "2";
        System.out.println(two + 1 +one);  //211
        System.out.println(one + 1 + two); //22
    }
}

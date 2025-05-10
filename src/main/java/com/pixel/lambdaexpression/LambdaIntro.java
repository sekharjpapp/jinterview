package com.pixel.lambdaexpression;

import java.util.List;

public class LambdaIntro {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c"); //<1>

        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        list.forEach((s)-> System.out.println(s));
    }
}

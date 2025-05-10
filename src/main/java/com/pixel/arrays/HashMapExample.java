package com.pixel.arrays;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);

        for (Map.Entry<String,Integer> entry:map.entrySet()){
            //System.out.println(entry.getKey() + " " + entry.getValue());
            //System.out.println("----------------------");
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}

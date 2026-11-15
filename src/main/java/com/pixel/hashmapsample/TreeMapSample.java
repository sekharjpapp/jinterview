package com.pixel.hashmapsample;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>(String::compareTo);
        map.put("One",1);
        map.put("Three",3);
        map.put("Two",2);
        for (Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}

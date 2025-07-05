package com.pixel.listmapconvert;

import java.util.HashMap;
import java.util.Map;

public class HashmapSample {
    public static void main(String[] args) {
        // Example usage of HashMap
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", 42);
        map.put("key2", 3.14);

        // Print the HashMap
        System.out.println("HashMap contents: " + map);
    }
}

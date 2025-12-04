package com.pixel.morganstanley;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
public class HashMapSample {
    private String color;
    @Override
    public int hashCode() {
        return 1; //
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HashMapSample that = (HashMapSample) o;
        return Objects.equals(color, that.color);
    }

    public static void main(String[] args) {
        Map<HashMapSample,String> map = new HashMap<>();
        map.put(new HashMapSample("Red"),"Red");
        map.put(new HashMapSample("Blue"),"Blue");
        map.put(new HashMapSample("Green"),"Green");
        System.out.println(map.get(new HashMapSample("Blue")));

    }
}

package com.pixel.visa.mapsample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        Map<Emp, Integer> map = new HashMap<>();
        map.put(new Emp("AB", 1), 1000);
        map.put(new Emp("AB", 2), 2000);
        map.put(new Emp("BC", 3), 3000);

        map.forEach((k, v) -> System.out.println(k + " => " + v));
        Emp emp = new Emp("AB", 1);
        Emp emp1 = new Emp("AB", 2);
        Emp emp2 = new Emp("BC", 3);
        int hashCode = emp.hashCode();
        int hashCode1 = emp1.hashCode();
        int hashCode2 = emp2.hashCode();
        System.out.println("HashCode: " + hashCode1);
        System.out.println("HashCode: " + hashCode2);
        System.out.println("HashCode: " + hashCode);

        int defaultCapacity = 16; // Default HashMap capacity
        int index = (defaultCapacity - 1) & hashCode;
        System.out.println("Bucket index (for capacity 16): " + index);

        // Put in map and verify
        map.put(emp, 1000);
        System.out.println("Map size: " + map.size());
    }
}

class Emp {
   String name;
   int id;

    public Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 1;
    }
    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }
}

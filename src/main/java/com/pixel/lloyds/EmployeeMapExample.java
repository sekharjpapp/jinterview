package com.pixel.lloyds;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapExample {
    public static void main(String[] args) {
        // Create some EmployeeMap objects
        EmployeeMap manager = new EmployeeMap(1, "Alice", null); // Manager has no manager
        EmployeeMap employee1 = new EmployeeMap(2, "Bob", manager);
        EmployeeMap employee2 = new EmployeeMap(3, "Charlie", manager);
        EmployeeMap employee3 = new EmployeeMap(4, "Bob", manager);


        // Create a Map to store EmployeeMap as keys and their departments as values
        Map<EmployeeMap, String> employeeMap = new HashMap<>();
        employeeMap.put(manager, "Management");
        employeeMap.put(employee1, "HR");
        employeeMap.put(employee2, "Finance");
        employeeMap.put(employee3, "HR");

        //System.out.println(employeeMap.hashCode());
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee3.hashCode());

        int bucketNumber = employee1.hashCode() & (16 - 1); // Assuming capacity is 16
        System.out.println(bucketNumber);

        int bucketEmp3 = employee3.hashCode() & (16 - 1);
        System.out.println(bucketEmp3);
        int bucketEmp2 = employee2.hashCode() & (16 - 1);
        System.out.println(bucketEmp2);

        // Iterate over the Map
        for (Map.Entry<EmployeeMap, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + ", Department: " + entry.getValue());
        }
    }
}

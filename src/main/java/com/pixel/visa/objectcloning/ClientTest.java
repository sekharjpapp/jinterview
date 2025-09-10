package com.pixel.visa.objectcloning;

public class ClientTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John Doe", 30, "john@gmail.com", "password123");
        System.out.println("Original Object is: " + emp1);

        try {
            Object clone = emp1.clone();
            Employee emp2 = (Employee) clone;
            System.out.println("Cloned Object is: " + emp2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

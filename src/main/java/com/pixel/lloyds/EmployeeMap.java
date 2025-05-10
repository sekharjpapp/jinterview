package com.pixel.lloyds;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class EmployeeMap {
    private int id;
    private String name;
    private EmployeeMap manager; // Reference to another EmployeeMap (e.g., Manager)

    // Constructor
    public EmployeeMap(int id, String name, EmployeeMap manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EmployeeMap getManager() {
        return manager;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeMap that = (EmployeeMap) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(manager, that.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, manager);
    }*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeMap that = (EmployeeMap) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(manager, that.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, manager);
    }

    @Override
    public String toString() {
        return "EmployeeMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manager=" + (manager != null ? manager.getName() : "None") +
                '}';
    }
}



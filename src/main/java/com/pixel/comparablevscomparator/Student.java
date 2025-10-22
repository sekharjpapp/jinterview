package com.pixel.comparablevscomparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student> {

    private int id;
    private String name;

    @Override
    public int compareTo(Student s) {
        if (this.id > s.id) {
            return 1;
        } else if (this.id < s.id) {
            return -1;
        }
        return 0;
    }
}

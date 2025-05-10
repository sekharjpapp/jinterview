package com.pixel.epam;

import java.time.LocalDate;
import java.time.Period;

public class AgeOfAPerson {
    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(1995, 12, 15);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);
        System.out.println("Person's age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
    }
}

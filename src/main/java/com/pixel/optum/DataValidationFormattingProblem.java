package com.pixel.optum;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DataValidationFormattingProblem {


        public static void main(String[] args) {
            Date localDateAndTime = new Date();

            //TODO - Print the current date and time in format 12/30/2022 12:30:42
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println(dateFormat.format(localDateAndTime));

            System.out.println();
            double amount = 190000;
            //TODO - Print the amount in USA currency format
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println(currencyFormat.format(amount));

            System.out.println();
            System.out.println(isValidName("Optum"));
            System.out.println(isValidName("Optum_2023"));
            System.out.println(isValidName("Optum@2023"));
            System.out.println(isValidName("Optum 2023"));

        }

        static boolean isValidName(String inputName) {
            //TODO - return true if the inputName consists only word characters (alphabets, numbers, underscore) else return false
            return inputName.matches("\\w+");
        }
}

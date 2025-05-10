package com.pixel.fizbuzz;

public class FizBuzzClient {
    public static void main(String[] args) {

        String str = "2";
        System.out.println(str + 1 + "2");
        System.out.println( 1 + "2" +1);

        /*for (int i = 0; i < 100; i++) {

            if (i %3 == 0 && i % 5 ==0 ) {
                System.out.println(i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }*/
       getResults();
    }
    public static int getResults() {
        int result = 0;
        try {
            result = 10;
        } catch (Exception e) {
            result = 20;
        } finally {
            System.out.println("Cleanup code in finally block");
            return result;
        }
        
    }
}

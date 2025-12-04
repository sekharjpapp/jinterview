package com.pixel.javapoly;

public class TryWithResouces {
    public static void main(String[] args) {
     try(Resource r = new Resource())  {
         System.out.println("Inside try block");
         throw new RuntimeException("try block exception");
     } catch (Exception e) {
         System.out.println("Caught exception: " + e.getMessage());
         for (Throwable suppressed : e.getSuppressed()) {
             System.out.println("Suppressed exception: " + suppressed.getMessage());
         }
     }
    }
}
class Resource implements AutoCloseable {
    @Override
    public void close() {
        throw new RuntimeException("close exception");
    }
}
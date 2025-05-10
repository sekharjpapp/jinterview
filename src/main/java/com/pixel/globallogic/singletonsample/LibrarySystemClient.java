package com.pixel.globallogic.singletonsample;

public class LibrarySystemClient {
    public static void main(String[] args) {
        // Initialize book IDs for testing
        int[] bookIds = {101, 202, 303};

        // Get singleton instance (initializes books)
        LibrarySystemImpl library = LibrarySystemImpl.getInstance(bookIds);

        // Test Case 1: Borrow an available book
        System.out.println("Borrow 101 (1st attempt): " + library.borrow(101)); // Expected: true

        // Test Case 2: Borrow same book again (should fail)
        System.out.println("Borrow 101 (2nd attempt): " + library.borrow(101));  // Expected: false

        // Test Case 3: Return the book
        library.returnBook(101);
        System.out.println("Returned 101");

        // Test Case 4: Borrow after return
        System.out.println("Borrow 101 (after return): " + library.borrow(101)); // Expected: true

        // Test Case 5: Borrow non-existent book
        System.out.println("Borrow 999 (non-existent): " + library.borrow(999)); // Expected: false
    }
}

package com.pixel.globallogic.singletonsample;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LibrarySystemImpl implements LibrarySystem{

    private static volatile LibrarySystemImpl instance;
    private final Map<Integer, Boolean> books = new ConcurrentHashMap<>();

    // Private constructor to initialize books
    private LibrarySystemImpl(int[] bookIds) {
        for (int bookId : bookIds) {
            books.put(bookId, true); // Initialize all books as available
        }
    }

    // Singleton instance retrieval without parameters
    public static LibrarySystemImpl getInstance(int[] bookIds) {
        if (instance == null) {
            synchronized (LibrarySystemImpl.class) {
                if (instance == null) {
                    instance = new LibrarySystemImpl(bookIds);
                }
            }
        }
        return instance;
    }

    @Override
    public boolean borrow(int bookId) {
        return books.computeIfPresent(bookId, (id, available) -> {
            // Only allow borrow if available
            return !available; // Flip availability
        }) != null && !books.get(bookId); // Check if book existed and is now unavailable
    }

    @Override
    public void returnBook(int bookId) {
        books.put(bookId, true); // Mark book as available
    }
}

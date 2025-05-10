package com.pixel.globallogic.singletonsample;

public interface LibrarySystem {
    boolean borrow(int bookId);
    void returnBook(int bookId); // Renamed from 'return'
}

package com.pixel.sapient.hashmapup;

import com.pixel.sapient.hashmapup.service.BookSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class HashMapLookUp {

    @Autowired
    private BookSearchService bookSearchService;
    public static void main(String[] args) {
        SpringApplication.run(HashMapLookUp.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void go() {
        String bookToFind = "my_book";
        int shelfNumber = bookSearchService.findBook(bookToFind);
        if (shelfNumber != -1) {
            System.out.println("Book '" + bookToFind + "' is located on shelf number: " + shelfNumber);
        } else {
            System.out.println("Book '" + bookToFind + "' not found in the library.");
        }
    }
}

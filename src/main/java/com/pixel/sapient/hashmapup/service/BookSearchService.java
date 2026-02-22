package com.pixel.sapient.hashmapup.service;

import com.pixel.sapient.hashmapup.model.Shelf;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookSearchService {

    private Map<String, Integer> bookToShelfMap = new HashMap<>();

    @PostConstruct
    public void initLibrary() {
        // Initialize shelves
        List<Shelf> shelves = List.of(
                new Shelf(1, List.of("Java Basics", "Python Intro", "Algorithms")),
                new Shelf(2, List.of("Data Structures", "Design Patterns", "Clean Code")),
                new Shelf(3, List.of("my_book", "Web Dev", "Database Systems"))
        );

        // Build lookup map O(n)
        for (Shelf shelf : shelves) {
            for (String book : shelf.books()) {
                bookToShelfMap.put(book, shelf.number());
            }
        }
    }

    public int findBook(String bookName) {
        return bookToShelfMap.getOrDefault(bookName, -1);
    }
}

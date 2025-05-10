package com.pixel.wipro.factorypattern;

import java.util.Scanner;

// Enum for Publication Types
enum PublicationType {
    NOVEL("novel"),
    COMIC_BOOK("comicbook"),
    NEWSPAPER("newspaper"),
    OTHER("other");

    private final String type;

    PublicationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static PublicationType fromString(String type) {
        for (PublicationType publicationType : PublicationType.values()) {
            if (publicationType.getType().equalsIgnoreCase(type)) {
                return publicationType;
            }
        }
        return OTHER; // Default to OTHER if no match found
    }
}

// Abstract superclass for Publications
abstract class Publication {
    protected String title;

    public Publication(String title) {
        this.title = title;
    }

    public abstract String getType();
    public abstract String getTitle();
}

// Subclass for Novel
class Novel extends Publication {
    public Novel(String title) {
        super(title);
    }

    @Override
    public String getType() {
        return "Type: Novel";
    }

    @Override
    public String getTitle() {
        return "Title: " + title;
    }
}

// Subclass for ComicBook
class ComicBook extends Publication {
    public ComicBook(String title) {
        super(title);
    }

    @Override
    public String getType() {
        return "Type: Comic Book";
    }

    @Override
    public String getTitle() {
        return "Title: " + title;
    }
}

// Subclass for Newspaper
class Newspaper extends Publication {
    public Newspaper(String title) {
        super(title);
    }

    @Override
    public String getType() {
        return "Type: Newspaper";
    }

    @Override
    public String getTitle() {
        return "Title: " + title;
    }
}

// Subclass for OtherPublication
class OtherPublication extends Publication {
    public OtherPublication(String title) {
        super(title);
    }

    @Override
    public String getType() {
        return "Type: Other Publication";
    }

    @Override
    public String getTitle() {
        return "Title: " + title;
    }
}

// Main class with the factory method
public class PublicationFactory {

    // Factory method to create Publication objects
    public static Publication getPublication(PublicationType type, String title) {
        switch (type) {
            case NOVEL:
                return new Novel(title);
            case COMIC_BOOK:
                return new ComicBook(title);
            case NEWSPAPER:
                return new Newspaper(title);
            default:
                return new OtherPublication(title);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get publication type from the user
        System.out.println("Enter the type of publication (Novel, ComicBook, Newspaper, Other): ");
        String typeInput = scanner.nextLine();

        // Get title from the user
        System.out.println("Enter the title of the publication: ");
        String title = scanner.nextLine();

        // Convert user input into PublicationType using the enum method
        PublicationType type = PublicationType.fromString(typeInput);

        // Create the appropriate publication
        Publication publication = getPublication(type, title);

        // Display the type and title of the publication
        System.out.println(publication.getType());
        System.out.println(publication.getTitle());
    }
}

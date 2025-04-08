package com.xworkz.lilyblossomstore.internal.store;

public class TypeOfBook {
    public void bookType(Library library) {
        System.out.println("\nInside TypeOfBook class - Checking library type...");

        library.addBook();
        library.issueBook();
        library.returnBook();
        library.catalog();
        library.membership();

        if (library instanceof DigitalLibrary) {
            System.out.println("Casting Library to DigitalLibrary to access downloadBook...");
            DigitalLibrary digital = (DigitalLibrary) library;
            digital.downloadBook();
        }
    }
}

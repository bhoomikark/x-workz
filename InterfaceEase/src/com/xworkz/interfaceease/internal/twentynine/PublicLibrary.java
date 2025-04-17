package com.xworkz.interfaceease.internal.twentynine;

public class PublicLibrary implements LibraryManagement {
    @Override
    public void borrowBook() {
        System.out.println("Borrowing a book from the public library.");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning a book to the public library.");
    }

    @Override
    public void searchBook() {
        System.out.println("Searching for a book in the public library.");
    }
@Override
    public void viewSettings()
    {
        System.out.println("view settings -- public library");
    }
}

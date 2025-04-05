package com.xworkz.lilyblossomstore.internal.recordbook;

public class RecordBook {
    public RecordBook() {
        System.out.println("Running RecordBook Constructor in RecordBook class");
    }

    public void write() {
        System.out.println("Parent class");
        System.out.println("Writing in the record book.");
    }

    public void read() {
        System.out.println("Parent class");
        System.out.println("Reading from the record book.");
    }

    public void store() {
        System.out.println("Parent class");
        System.out.println("Storing the record book.");
    }

    public void tear() {
        System.out.println("Parent class");
        System.out.println("Tearing the record book.");
    }

    public void erase() {
        System.out.println("Parent class");
        System.out.println("Erasing the record book.");
    }
}

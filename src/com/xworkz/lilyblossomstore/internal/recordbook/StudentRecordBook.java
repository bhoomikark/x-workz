package com.xworkz.lilyblossomstore.internal.recordbook;

public class StudentRecordBook extends RecordBook {
    public StudentRecordBook() {
        super();
        System.out.println("Running StudentRecordBook Constructor in StudentRecordBook class");
    }

    @Override
    public void write() {
        System.out.println("Child class");
        System.out.println("Student writing notes in the record book.");
    }

    @Override
    public void read() {
        System.out.println("Child class");
        System.out.println("Student reading academic details from the record book.");
    }

    @Override
    public void store() {
        System.out.println("Child class");
        System.out.println("StudentRecordBook stored safely in the backpack.");
    }

    @Override
    public void tear() {
        System.out.println("Child class");
        System.out.println("Student accidentally tore a page from the record book.");
    }

    @Override
    public void erase() {
        System.out.println("Child class");
        System.out.println("Student erased a mistake from the record book.");
    }
}

package com.xworkz.interfaceease.internal.fiftyseven;

public class Kindle implements EBookReader {
    @Override
    public void openBook() {
        System.out.println("Book opened on Kindle.");
    }

    @Override
    public void readPage() {
        System.out.println("Reading page...");
    }

    @Override
    public void closeBook() {
        System.out.println("Book closed.");
    }
@Override
    public void countPage()
    {
        System.out.println("Running count page -- kindle");
    }
}

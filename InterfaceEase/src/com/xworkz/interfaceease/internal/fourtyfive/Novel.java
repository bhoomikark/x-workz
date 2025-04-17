package com.xworkz.interfaceease.internal.fourtyfive;

public class Novel implements Book {
    @Override
    public void open() {
        System.out.println("Book opened.");
    }
    @Override
    public void read() {
        System.out.println("Reading the story...");
    }
    @Override
    public void close() {
        System.out.println("Book closed.");
    }
@Override
    public void write()
    {
        System.out.println("write notes -- default -- novel");
    }
}

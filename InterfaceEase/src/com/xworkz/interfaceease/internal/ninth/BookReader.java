package com.xworkz.interfaceease.internal.ninth;

public class BookReader implements Readable{
    @Override
    public void openDocument() {
        System.out.println("open document -- readable -- BookReader");
    }

    @Override
    public void readContent() {
        System.out.println("read content -- readable -- BookReader");
    }

    @Override
    public void closeDocument() {
        System.out.println("close document -- readable -- BookReader");
    }
}

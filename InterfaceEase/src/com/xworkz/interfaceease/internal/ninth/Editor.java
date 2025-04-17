package com.xworkz.interfaceease.internal.ninth;

public class Editor implements Readable,Writable {
    @Override
    public void openDocument() {
        System.out.println("openDocument --(Readable) Editor");
    }

    @Override
    public void readContent() {
        System.out.println("read content --(Readable) Editor");

    }

    @Override
    public void closeDocument() {
        System.out.println("closeDocument --(Readable) Editor");
    }

    @Override
    public void createDocument() {
        System.out.println("create Document --(Writable) Editor");
    }

    @Override
    public void writeContent() {
        System.out.println("write content --(Writable) Editor");
    }

    @Override
    public void saveDocument() {
        System.out.println("save document --(Writable) Editor");
    }
}

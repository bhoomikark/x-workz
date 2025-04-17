package com.xworkz.interfaceease.internal.ninth;

public class NoteTaker implements Readable,Writable{
    @Override
    public void openDocument() {
        System.out.println("openDocument --(Readable) NoteTaker");
    }

    @Override
    public void readContent() {
        System.out.println("read content --(Readable) NoteTaker");

    }

    @Override
    public void closeDocument() {
        System.out.println("closeDocument --(Readable) NoteTaker");
    }

    @Override
    public void createDocument() {
        System.out.println("create Document --(Writable) NoteTaker");
    }

    @Override
    public void writeContent() {
        System.out.println("write content --(Writable) NoteTaker");
    }

    @Override
    public void saveDocument() {
        System.out.println("save document --(Writable) NoteTaker");
    }
}

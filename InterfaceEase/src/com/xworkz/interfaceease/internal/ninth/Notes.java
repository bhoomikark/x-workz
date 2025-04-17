package com.xworkz.interfaceease.internal.ninth;

public class Notes implements  Writable{
    @Override
    public void createDocument() {
        System.out.println("create Document --(Writable) Notes");
    }

    @Override
    public void writeContent() {
        System.out.println("write content --(Writable) Notes");
    }

    @Override
    public void saveDocument() {
        System.out.println("save document --(Writable) Notes");
    }
@Override
    public void writeStory()
    {
        System.out.println("Write story -- default -- Notes");
    }

}

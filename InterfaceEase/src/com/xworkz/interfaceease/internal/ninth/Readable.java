package com.xworkz.interfaceease.internal.ninth;

public interface Readable {
    void openDocument();
    void readContent();
    void closeDocument();
    default void readStory()
    {
        System.out.println("reda stopry -- default");
    }
}

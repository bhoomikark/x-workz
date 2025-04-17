package com.xworkz.interfaceease.internal.ninth;

public interface Writable {
    void createDocument();
    void writeContent();
    void saveDocument();
    default void writeStory()
    {
        System.out.println("Write story");
    }
}

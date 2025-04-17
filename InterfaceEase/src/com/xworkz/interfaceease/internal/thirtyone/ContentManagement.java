package com.xworkz.interfaceease.internal.thirtyone;

public interface ContentManagement {
    void createContent();
    void publishContent();
    void deleteContent();
    default void makeReels()
    {
        System.out.println("make reels -- default");
    }
}

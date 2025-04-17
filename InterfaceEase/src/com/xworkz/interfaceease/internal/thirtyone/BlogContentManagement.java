package com.xworkz.interfaceease.internal.thirtyone;

public class BlogContentManagement implements ContentManagement {
    @Override
    public void createContent() {
        System.out.println("Creating blog content.");
    }

    @Override
    public void publishContent() {
        System.out.println("Publishing blog content.");
    }

    @Override
    public void deleteContent() {
        System.out.println("Deleting blog content.");
    }
@Override
    public void makeReels()
    {
        System.out.println("make reels -- Blog content");
    }
}

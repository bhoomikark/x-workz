package com.xworkz.interfaceease.internal.first;

public class Teacher implements School {

    @Override
    public void Open() {
        System.out.println("Running Open from School in Teacher");
    }

    @Override
    public void Close() {
        System.out.println("Running Close from School in Tecaher");
    }

    @Override
    public void Work() {
        System.out.println("Running Work from School in Teacher");
    }
}

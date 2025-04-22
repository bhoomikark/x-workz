package com.xworkz.late.internal.wwpackage;

public class MessageImpl implements Message {
    public MessageImpl() {
        super();
        System.out.println("No-arg constructor of MessageImpl");
    }

    @Override
    public void send() {
        System.out.println("Overriding Message - Sending message");
    }
}

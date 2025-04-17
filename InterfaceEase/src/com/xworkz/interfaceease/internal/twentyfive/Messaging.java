package com.xworkz.interfaceease.internal.twentyfive;

public interface Messaging {
    void sendMessage();
    void receiveMessage();
    void deleteMessage();
    default void unsendMessage()
    {
        System.out.println("unsend message");
    }
}

package com.xworkz.interfaceease.internal.twentyfive;

public class WhatsApp implements Messaging {
    @Override
    public void sendMessage() {
        System.out.println("Sending message via WhatsApp.");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Receiving message via WhatsApp.");
    }

    @Override
    public void deleteMessage() {
        System.out.println("Deleting message in WhatsApp.");
    }
}

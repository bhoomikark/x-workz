package com.xworkz.interfaceease.internal.twentyone;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User will be notified via Email.");
    }
    @Override
    public void prepareMessage() {
        System.out.println("Preparing the email content...");
    }
    @Override
    public void send() {
        System.out.println("Email sent successfully.");
    }
}

package com.xworkz.swiggit.internal;

public class Notification {
    private int noOfNotification;
    private String notificationsFrom;
    private String notificationType;

    public Notification(int noOfNotification, String notificationsFrom, String notificationType) {
        this.noOfNotification = noOfNotification;
        this.notificationsFrom = notificationsFrom;
        this.notificationType = notificationType;
        System.out.println("69. Running Notification Constructor");
    }

    @Override
    public String toString() {
        return "No of Notifications: " + noOfNotification +
                ", From: " + notificationsFrom +
                ", Type: " + notificationType;
    }
}

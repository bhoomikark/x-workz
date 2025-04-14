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
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 567;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Notification) {
                System.out.println("Notification is reference of Object");
                Notification n1 = this;
                Notification n2 = (Notification) obj;
                if (n1.noOfNotification == n2.noOfNotification &&
                        n1.notificationsFrom.equals(n2.notificationsFrom) &&
                        n1.notificationType.equals(n2.notificationType)) {
                    System.out.println("Both Notification objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}

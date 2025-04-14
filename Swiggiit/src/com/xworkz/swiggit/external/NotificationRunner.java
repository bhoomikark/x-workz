package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Notification;

public class NotificationRunner {
    public static void main(String[] args) {
        Notification notification = new Notification(5, "Instagram", "Social Media");
        System.out.println(notification);
        System.out.println("Overridden HashCode: " + notification.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(notification));
        Notification notification1 = new Notification(5, "Instagram", "Social Media");
        Notification notification2 = new Notification(10, "Facebook", "Social Media");

        System.out.println("notification.equals(notification1)? " + notification.equals(notification1));
        System.out.println("notification.equals(notification2)? " + notification.equals(notification2));
    }
}

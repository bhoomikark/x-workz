package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Notification;

public class NotificationRunner {
    public static void main(String[] args) {
        Notification notification = new Notification(5, "Instagram", "Social Media");
        System.out.println(notification);
        System.out.println("Overridden HashCode: " + notification.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(notification));

    }
}

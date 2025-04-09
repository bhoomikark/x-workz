package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Notification;

public class NotificationRunner {
    public static void main(String[] args) {
        Notification notification = new Notification(5, "Instagram", "Social Media");
        System.out.println(notification);
    }
}

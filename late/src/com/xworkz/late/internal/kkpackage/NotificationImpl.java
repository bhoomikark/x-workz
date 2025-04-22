// kkpackage - implementation
package com.xworkz.late.internal.kkpackage;

public class NotificationImpl implements Notification {
    public NotificationImpl() {
        super();
        System.out.println("No-arg constructor of NotificationImpl");
    }

    @Override
    public void alert() {
        System.out.println("Overriding Notification - Sending app alert");
    }
}

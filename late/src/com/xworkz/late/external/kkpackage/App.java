// kkpackage - external
package com.xworkz.late.external.kkpackage;

import com.xworkz.late.internal.kkpackage.Notification;

public class App {
    Notification notification;

    public App(Notification notification) {
        System.out.println("Parameterized constructor of App");
        this.notification = notification;
    }

    public void notifyUser() {
        if (notification != null) {
            notification.alert();
        } else {
            System.out.println("No notification to send");
        }
    }
}

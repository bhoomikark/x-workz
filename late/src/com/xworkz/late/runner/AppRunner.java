// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.kkpackage.*;
import com.xworkz.late.external.kkpackage.*;

public class AppRunner {
    public static void main(String[] args) {
        Notification notification = new NotificationImpl();
        App app = new App(notification);
        app.notifyUser();
    }
}

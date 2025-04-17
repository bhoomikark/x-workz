package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twentyone.*;

public class TwentyOneRunner {
    public static void main(String[] args) {
        Notification n = new EmailNotification();
        n.notifyUser();
        n.prepareMessage();
        n.send();
    }
}

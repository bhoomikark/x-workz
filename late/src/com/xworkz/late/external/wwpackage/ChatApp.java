package com.xworkz.late.external.wwpackage;

import com.xworkz.late.internal.wwpackage.Message;

public class ChatApp {
    Message message;

    public ChatApp(Message message) {
        System.out.println("Parameterized constructor of ChatApp");
        this.message = message;
    }

    public void chatNow() {
        if (message != null) {
            message.send();
        } else {
            System.out.println("Message is null");
        }
    }
}

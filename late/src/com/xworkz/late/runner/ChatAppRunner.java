package com.xworkz.late.runner;

import com.xworkz.late.internal.wwpackage.*;
import com.xworkz.late.external.wwpackage.*;

public class ChatAppRunner {
    public static void main(String[] args) {
        Message message = new MessageImpl();
        ChatApp app = new ChatApp(message);
        app.chatNow();
    }
}

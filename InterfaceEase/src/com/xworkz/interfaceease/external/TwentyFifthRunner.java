package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twentyfive.*;

public class TwentyFifthRunner {
    public static void main(String[] args) {
        Messaging m = new WhatsApp();
        m.sendMessage();
        m.receiveMessage();
        m.deleteMessage();
    }
}

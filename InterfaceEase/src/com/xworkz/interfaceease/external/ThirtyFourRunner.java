package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.thirtyfour.*;

public class ThirtyFourRunner {
    public static void main(String[] args) {
        EventManagement event = new WeddingEvent();
        event.planEvent();
        event.executeEvent();
        event.evaluateEvent();
        event.planParty();
    }
}


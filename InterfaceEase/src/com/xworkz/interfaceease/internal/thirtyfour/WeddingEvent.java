package com.xworkz.interfaceease.internal.thirtyfour;

public class WeddingEvent implements EventManagement {
    @Override
    public void planEvent() {
        System.out.println("Planning the wedding event.");
    }

    @Override
    public void executeEvent() {
        System.out.println("Executing the wedding event.");
    }

    @Override
    public void evaluateEvent() {
        System.out.println("Evaluating the wedding event's success.");
    }
@Override
    public void planParty()
    {
        System.out.println("Plan party -- Wedding event");
    }

}

package com.xworkz.late.internal.xxpackage;

public class EventImpl implements Event {
    public EventImpl() {
        super();
        System.out.println("No-arg constructor of EventImpl");
    }

    @Override
    public void schedule() {
        System.out.println("Overriding Event - Scheduling event");
    }
}

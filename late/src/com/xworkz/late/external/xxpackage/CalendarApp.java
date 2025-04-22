package com.xworkz.late.external.xxpackage;

import com.xworkz.late.internal.xxpackage.Event;

public class CalendarApp {
    Event event;

    public CalendarApp(Event event) {
        System.out.println("Parameterized constructor of CalendarApp");
        this.event = event;
    }

    public void display() {
        if (event != null) {
            event.schedule();
        } else {
            System.out.println("No events to display");
        }
    }
}

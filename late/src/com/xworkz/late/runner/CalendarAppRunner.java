package com.xworkz.late.runner;

import com.xworkz.late.internal.xxpackage.*;
import com.xworkz.late.external.xxpackage.*;

public class CalendarAppRunner {
    public static void main(String[] args) {
        Event event = new EventImpl();
        CalendarApp app = new CalendarApp(event);
        app.display();
    }
}

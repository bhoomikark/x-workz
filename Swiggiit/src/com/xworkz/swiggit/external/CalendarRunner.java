package com.xworkz.swiggit.runner;

import com.xworkz.swiggit.internal.Calendar;

public class CalendarRunner {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(2025, "Wall Calendar", true);
        System.out.println(calendar);
    }
}

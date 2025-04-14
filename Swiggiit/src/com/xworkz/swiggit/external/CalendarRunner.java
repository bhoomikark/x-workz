package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Calendar;

public class CalendarRunner {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(2025, "Wall Calendar", true);
        System.out.println(calendar);
        System.out.println("Calendar HashCode: " + calendar.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(calendar));
        Calendar calendar1 = new Calendar(2024, "Table Calendar", false);
        Calendar calendar2 = new Calendar(2025, "Wall Calendar", true);

        System.out.println("Are at same location or not: " + (calendar1 == calendar2));
        boolean value = calendar2.equals(calendar);
        System.out.println("Are both calendars same? " + value);
    }
}

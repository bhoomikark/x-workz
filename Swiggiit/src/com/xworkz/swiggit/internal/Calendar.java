package com.xworkz.swiggit.internal;

public class Calendar {
    private int year;
    private String calendarType;
    private boolean hasHolidaysMarked;

    public Calendar(int year, String calendarType, boolean hasHolidaysMarked) {
        this.year = year;
        this.calendarType = calendarType;
        this.hasHolidaysMarked = hasHolidaysMarked;
        System.out.println("83. Running Calendar Constructor");
    }

    public String toString() {
        return "Year: " + year + ", Type: " + calendarType + ", Holidays Marked: " + hasHolidaysMarked;
    }
}

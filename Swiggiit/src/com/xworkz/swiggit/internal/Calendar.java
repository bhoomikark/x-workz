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
@Override
    public String toString() {
        return "Year: " + year + ", Type: " + calendarType + ", Holidays Marked: " + hasHolidaysMarked;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 111;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Calendar) {
                System.out.println("Calendar is reference of object");
                Calendar calendar1 = this;
                Calendar calendar2 = (Calendar) obj;
                if (calendar1.year == calendar2.year &&
                        calendar1.calendarType.equals(calendar2.calendarType)) {
                    System.out.println("Both calendars are the same");
                    return true;
                }
            }
        }
        return false;
    }
}

// pppackage - external
package com.xworkz.late.external.pppackage;

import com.xworkz.late.internal.pppackage.Schedule;

public class Calendar {
    Schedule schedule;

    public Calendar(Schedule schedule) {
        System.out.println("Parameterized constructor of Calendar");
        this.schedule = schedule;
    }

    public void showSchedule() {
        if (schedule != null) {
            schedule.plan();
        } else {
            System.out.println("Schedule is not available");
        }
    }
}

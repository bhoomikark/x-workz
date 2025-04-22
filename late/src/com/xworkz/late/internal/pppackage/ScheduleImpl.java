// pppackage - implementation
package com.xworkz.late.internal.pppackage;

public class ScheduleImpl implements Schedule {
    public ScheduleImpl() {
        super();
        System.out.println("No-arg constructor of ScheduleImpl");
    }

    @Override
    public void plan() {
        System.out.println("Overriding Schedule - Planning the schedule");
    }
}

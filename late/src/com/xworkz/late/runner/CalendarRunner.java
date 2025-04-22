// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.pppackage.*;
import com.xworkz.late.external.pppackage.*;

public class CalendarRunner {
    public static void main(String[] args) {
        Schedule schedule = new ScheduleImpl();
        Calendar calendar = new Calendar(schedule);
        calendar.showSchedule();
    }
}

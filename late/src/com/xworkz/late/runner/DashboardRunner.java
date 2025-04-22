
package com.xworkz.late.runner;

import com.xworkz.late.internal.oopackage.*;
import com.xworkz.late.external.oopackage.*;

public class DashboardRunner {
    public static void main(String[] args) {
        Report report = new ReportImpl();
        Dashboard dashboard = new Dashboard(report);
        dashboard.displayReport();
    }
}

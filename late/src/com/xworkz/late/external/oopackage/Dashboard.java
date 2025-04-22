// oopackage - external
package com.xworkz.late.external.oopackage;

import com.xworkz.late.internal.oopackage.Report;

public class Dashboard {
    Report report;

    public Dashboard(Report report) {
        System.out.println("Parameterized constructor of Dashboard");
        this.report = report;
    }

    public void displayReport() {
        if (report != null) {
            report.generate();
        } else {
            System.out.println("No report available");
        }
    }
}

// oopackage - implementation
package com.xworkz.late.internal.oopackage;

public class ReportImpl implements Report {
    public ReportImpl() {
        super();
        System.out.println("No-arg constructor of ReportImpl");
    }

    @Override
    public void generate() {
        System.out.println("Overriding Report - Report generated");
    }
}

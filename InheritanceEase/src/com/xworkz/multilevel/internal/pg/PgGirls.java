package com.xworkz.multilevel.internal.pg;

public class PgGirls extends PgStudents {
    public boolean hasSecurity = true;
    public void facility() {
        System.out.println("Security Facility: " + hasSecurity);
    }
}
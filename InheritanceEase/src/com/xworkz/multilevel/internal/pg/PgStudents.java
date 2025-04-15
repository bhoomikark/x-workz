package com.xworkz.multilevel.internal.pg;

public class PgStudents extends PgOwner {
    public int roomNumber = 102;
    public void allocateRoom() {
        System.out.println("Allocated Room No: " + roomNumber);
    }
}
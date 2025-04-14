package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Teacher;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(45000.0, "Mrs. Anjali", "Mathematics");

        System.out.println("Teacher to string: " + teacher.toString());
        System.out.println("Overridden HashCode: " + teacher.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(teacher));

        Teacher teacher1 = new Teacher(45000.0, "Mrs. Anjali", "Mathematics");
        Teacher teacher2 = new Teacher(50000.0, "Mr. Ramesh", "Science");


        System.out.println("teacher.equals(teacher1)? " + teacher.equals(teacher1));
        System.out.println("teacher.equals(teacher2)? " + teacher.equals(teacher2));
    }
}

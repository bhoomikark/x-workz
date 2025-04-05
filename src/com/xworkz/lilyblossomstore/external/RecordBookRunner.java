package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.recordbook.RecordBook;
import com.xworkz.lilyblossomstore.internal.recordbook.StudentRecordBook;

public class RecordBookRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        RecordBook recordBook1 = new RecordBook();
        recordBook1.write();
        recordBook1.read();
        recordBook1.store();
        recordBook1.tear();
        recordBook1.erase();

        System.out.println("Using parent type reference:");
        RecordBook recordBook = new StudentRecordBook();
        recordBook.write();
        recordBook.read();
        recordBook.store();
        recordBook.tear();
        recordBook.erase();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        StudentRecordBook studentRecordBook = new StudentRecordBook();
        studentRecordBook.write();
        studentRecordBook.read();
        studentRecordBook.store();
        studentRecordBook.tear();
         studentRecordBook.erase();
    }
}

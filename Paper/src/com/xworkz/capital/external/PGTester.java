package com.xworkz.capital.external;
import com.xworkz.capital.internal.PG;
public class PGTester {
    public void testPG() {
        PG pgObject = new PG();


        pgObject.setsalary(50000);


        int retrievedSalary = pgObject.getsalary();


        System.out.println("Salary: " + retrievedSalary);
    }

    public static void main(String[] args) {
        PGTester tester = new PGTester();
        tester.testPG();
    }
    }


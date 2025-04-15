package com.xworkz.rkbuilding.employee.external;

import com.xworkz.rkbuilding.employee.internal.Manager;

public class EmployeeRunner {
    public static void main(String[] args) {
        System.out.println("Running Main");
        System.out.println("=====================================================");
        Manager manager=new Manager("Ram");
        Manager manager1=new Manager("Sunil",12);
        Manager manager2=new Manager("Prabhakar",20,20000.00,"Revenue");
        System.out.println("=====================================================");
    }
}

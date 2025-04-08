package com.xworkz.lilyblossomstore.internal.employee;

public class ManagerPA {
    public void allocateSalary(Employee employee){
        System.out.println("Running allocate Salary in MnagerPA");
        System.out.println("=====================================");
        employee.applyLeave();
        employee.receiveSalary();
        employee.attendMeeting();
        employee.work();
        employee.takeBreak();
        if(employee instanceof Manager)
        {
            System.out.println("Casting");
            Manager manager=(Manager) employee;
            manager.takeLeave();
        }
    }
}

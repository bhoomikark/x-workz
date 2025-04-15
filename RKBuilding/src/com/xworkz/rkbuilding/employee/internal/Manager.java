package com.xworkz.rkbuilding.employee.internal;

public class Manager extends Employee {
    public Manager(String name)
    {
        super(name);
    }
    public Manager(String name,int employeeId)
    {
        super(name,employeeId);

    }
    public Manager(String name,int employeeId,double salary,String department)
    {
        super(name, employeeId, salary, department);
    }
}

package com.xworkz.rkbuilding.employee.internal;

public abstract class Employee {
    String name;
    int employeeId;
    double salary;
    String department;
    public Employee(String name)
    {
        this.name=name;
        System.out.println("The name of employee1 is "+this.name);
    }
    public Employee(String name,int employeeId)
    {
        this.name=name;
        this.employeeId=employeeId;
        System.out.println("The name of Employee2 is: "+this.name);
        System.out.println("The EmployeeID is: "+this.employeeId);
    }
    public Employee(String name,int employeeId,double salary,String department)
    {
        this.name=name;
        this.employeeId=employeeId;
        this.department=department;
        this.salary=salary;
        System.out.println("The name of Employee3 is: "+this.name);
        System.out.println("The EmployeeID is: "+this.employeeId);
        System.out.println("The department of employee is: "+this.department);
        System.out.println("The salary of employee is "+this.salary);
    }
}

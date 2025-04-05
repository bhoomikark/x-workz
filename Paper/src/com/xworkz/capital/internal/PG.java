package com.xworkz.capital.internal;

public class PG {
    private int salary;
    public PG(){
        System.out.println("Running pg constructor in pg class");
    }
    public int getsalary()
    {
        return this.salary;
    }
    public void setsalary(int salary)
    {
        this.salary=salary;

    }
}

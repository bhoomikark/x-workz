package com.xworkz.count.country2;

public class ExperienceDetail {
    String company;
    int years;
    String role;
    double salary;

    public ExperienceDetail(String company, int years, String role, double salary) {
        this.company = company;
        this.years = years;
        this.role = role;
        this.salary = salary;
    }

    void display() {
        System.out.println("  ExperienceDetail: Company=" + company + ", Years=" + years + ", Role=" + role + ", Salary=" + salary);
    }
}

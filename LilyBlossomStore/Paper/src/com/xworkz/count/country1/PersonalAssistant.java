package com.xworkz.count.country1;

public class PersonalAssistant {
String name;
int age;
String department;
String specialization;
PersonalAssistant(String name,int age,String department,String specialization)
{
    this.name=name;
    this.age=age;
    this.department=department;
    this.specialization=specialization;
}
    void printDetails() {
        System.out.println("Personal Assistant Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
    }

}

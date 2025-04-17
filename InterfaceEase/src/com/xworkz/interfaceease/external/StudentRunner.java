package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.first.*;

public class StudentRunner {
    public static void main(String[] args) {
            System.out.println("1.Running interface school reference from Teacher class");
        School school = new Teacher();
         school.Open();
         school.Close();
         school.Work();
         school.homeWork();
        Funds funds3=new Bank();
        funds3.countingMoney();
        funds3.interest();
        funds3.takeLoan();
        funds3.checkFunds();


        System.out.println("=================================");
        System.out.println("2 copies from 2 new Classes");
        Funds funds1=new Students();
        funds1.countingMoney();
        funds1.interest();
        funds1.takeLoan();
        School school2=new Students();
        school2.Work();
        school2.Open();
        school2.Close();

        Funds funds2=new LabTeacher();
        funds2.countingMoney();
        funds2.takeLoan();
        funds2.interest();
        School school3=new LabTeacher();
        school3.Work();
        school3.Open();
        school3.Close();








    }
}

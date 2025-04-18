package com.xworkz.interfaceease.internal.learn;

public class ATMRunner {
    public static void main(String[] args) {
        ATM atm=new ATM();
        atm.setAtm(200,"Karnataka Bank");
   int m=atm.getNo();
       String b= atm.getcard();
        System.out.println(m+" "+b);
    }
}

package com.xworkz.interfaceease.internal.first;

public interface Funds {
  void countingMoney();
  void takeLoan();
  void interest();
  default void checkFunds()
  {
    System.out.println("Checking funds");
  }

}

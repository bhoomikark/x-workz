package com.xworkz.interfaceease.internal.twentyfour;

public interface Database {
    void connect();
    void readData();
    void closeConnection();
    default void query()
    {
        System.out.println("get to know queries -- default");
    }
}

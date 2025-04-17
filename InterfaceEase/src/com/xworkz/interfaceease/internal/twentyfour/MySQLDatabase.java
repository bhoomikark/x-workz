package com.xworkz.interfaceease.internal.twentyfour;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void readData() {
        System.out.println("Reading data from MySQL database.");
    }

    @Override
    public void closeConnection() {
        System.out.println("Closing MySQL database connection.");
    }
@Override
    public void query()
    {
        System.out.println("get to know queries -- my sql database");
    }
}

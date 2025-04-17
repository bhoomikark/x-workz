package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twentyfour.*;

public class TwentyFourRunner {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        db.connect();
        db.readData();
        db.closeConnection();
        db.query();
    }
}

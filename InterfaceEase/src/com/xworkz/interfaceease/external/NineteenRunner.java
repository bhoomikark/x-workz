package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.nineteen.*;

public class NineteenRunner {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.openAccount();
        b.depositMoney();
        b.closeAccount();
        b.withdrawMoney();
        b.openAccount();
    }
}

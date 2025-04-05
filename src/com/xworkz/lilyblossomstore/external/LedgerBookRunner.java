package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.ledgerbook.LedgerBook;
import com.xworkz.lilyblossomstore.internal.ledgerbook.AccountLedger;

public class LedgerBookRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        LedgerBook ledgerBook1 = new LedgerBook();
        ledgerBook1.recordTransaction();
        ledgerBook1.balanceSheet();
        ledgerBook1.auditRecords();
        ledgerBook1.closeLedger();
        ledgerBook1.printStatement();

        System.out.println("Using parent type reference:");
        LedgerBook ledgerBook = new AccountLedger();
        ledgerBook.recordTransaction();
        ledgerBook.balanceSheet();
        ledgerBook.auditRecords();
        ledgerBook.closeLedger();
        ledgerBook.printStatement();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        AccountLedger accountLedger = new AccountLedger();
        accountLedger.recordTransaction();
        accountLedger.balanceSheet();
        accountLedger.auditRecords();
        accountLedger.closeLedger();
        accountLedger.printStatement();
    }
}

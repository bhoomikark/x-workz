package com.xworkz.lilyblossomstore.internal.ledgerbook;

public class AccountLedger extends LedgerBook {
    public AccountLedger() {
        super();
        System.out.println("Running AccountLedger Constructor in Child class");
    }

    @Override
    public void recordTransaction() {
        System.out.println("Recording transaction in AccountLedger - Child class.");
    }

    @Override
    public void balanceSheet() {
        System.out.println("Generating balance sheet - Child class.");
    }

    @Override
    public void auditRecords() {
        System.out.println("Auditing records in AccountLedger - Child class.");
    }

    @Override
    public void closeLedger() {
        System.out.println("Closing ledger for the financial year - Child class.");
    }

    @Override
    public void printStatement() {
        System.out.println("Printing financial statements - Child class.");
    }
}

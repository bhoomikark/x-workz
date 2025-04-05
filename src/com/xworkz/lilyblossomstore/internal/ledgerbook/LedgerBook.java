package com.xworkz.lilyblossomstore.internal.ledgerbook;

public class LedgerBook {
    public LedgerBook() {
        System.out.println("Running LedgerBook Constructor in Parent class");
    }

    public void recordTransaction() {
        System.out.println("Recording transaction in LedgerBook - Parent class.");
    }

    public void balanceSheet() {
        System.out.println("Generating balance sheet - Parent class.");
    }

    public void auditRecords() {
        System.out.println("Auditing records in LedgerBook - Parent class.");
    }

    public void closeLedger() {
        System.out.println("Closing ledger for the financial year - Parent class.");
    }

    public void printStatement() {
        System.out.println("Printing financial statements - Parent class.");
    }
}

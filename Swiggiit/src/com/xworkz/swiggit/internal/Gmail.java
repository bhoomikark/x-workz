package com.xworkz.swiggit.internal;

public class Gmail {
    private String gmailAccount;
    private String accountName;
    private boolean gmailLogoutOption;

    public Gmail(String gmailAccount, String accountName, boolean gmailLogoutOption) {
        this.gmailAccount = gmailAccount;
        this.accountName = accountName;
        this.gmailLogoutOption = gmailLogoutOption;
        System.out.println("52. Running Gmail Constructor");
    }

    @Override
    public String toString() {
        return "Gmail Account: " + gmailAccount + ", Account Name: " + accountName +
                ", Logout Option Available: " + gmailLogoutOption;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 777;
    }
}

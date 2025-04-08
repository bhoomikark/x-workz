class Wallet {
    static void checkCash() {
        System.out.println("Checking available cash in Wallet.");
        displayWalletBalance();
        System.out.println("Above function 'displayWalletBalance()' shows the available balance.");
    }

    static void displayWalletBalance() {
        System.out.println("Your wallet balance is $100.");
        Bitcoin.mineBitcoin();
        System.out.println("Wallet balance checked. Now mining Bitcoin to increase funds.");
    }

    static void makePayment() {
        System.out.println("Making payment using Wallet balance.");
        System.out.println("Payment processing is complete. Bitcoin validation was performed.");
    }

    static void receiveMoney() {
        System.out.println("Receiving money from a friend.");
        Currency.convertCurrency();
        System.out.println("Received amount converted into desired currency.");
    }
}

class Bitcoin {
    static void mineBitcoin() {
        System.out.println("Mining Bitcoin process started.");
        validateBitcoin();
        System.out.println("Above function 'validateBitcoin()' ensures mining is successful.");
    }

    static void validateBitcoin() {
        System.out.println("Validating Bitcoin transaction.");
        Wallet.checkCash();
        System.out.println("Bitcoin transaction validated and stored in Wallet.");
    }

    static void checkMarketValue() {
        System.out.println("Fetching current Bitcoin market value.");
        trackBitcoin();
        System.out.println("Above function 'trackBitcoin()' monitors transactions.");
    }

    static void trackBitcoin() {
        System.out.println("Tracking Bitcoin transactions.");
        Currency.convertCurrency();
        System.out.println("After tracking, converting currency to Bitcoin value.");
    }
}

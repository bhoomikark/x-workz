class Gold {
    static void checkGoldQuality() {
        System.out.println("Checking gold purity level.");
        polishGold();
        System.out.println("Above function 'polishGold()' enhances the gold's shine.");
    }

    static void polishGold() {
        System.out.println("Polishing gold for better appearance.");
        Currency.convertCurrency();
        System.out.println("After polishing, checking currency value for selling price.");
    }

    static void sellGold() {
        System.out.println("Selling gold at the market.");
        Currency.withdrawCash();
        System.out.println("Gold sold successfully, cash withdrawn.");
    }

    static void buyGold() {
        System.out.println("Buying gold from a jeweler.");
        checkGoldQuality();
        System.out.println("Payment made using Wallet balance.");
    }
}

class Trafficsignal {
    static void displaySignal() {
        System.out.println("Traffic signal is displayed");
        getSignalColor();
    }

    static void getSignalColor() {
        System.out.println("The current signal is RED.");
		checkFine();
    }

    static void checkFine() {
        System.out.println("Checking fine for signal violation");
        Currency.checkCurrency(); // Calling from Currency
    }

    static void alertSound() {
        System.out.println("Beep! Beep! Traffic signal sound.");
        Currency.displayCurrencyInfo();
    }
}

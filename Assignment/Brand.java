class Brand {
    static void displayBrandName() {
        System.out.println("Brand name: Gucci");
        showQuality();
    }

    static void showQuality() {
        System.out.println("Brand quality is premium.");
		displayBrandName();
    }

    static void checkAuthenticity() {
        System.out.println("Checking brand authenticity...");
        Bitcoin.validateBitcoin();
    }

    static void verifyOwnership() {
	
        System.out.println("Verifying ownership...");
        Bitcoin.trackBitcoin();
    }
}

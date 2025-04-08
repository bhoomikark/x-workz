class Wire {
    static void connectWire() {
        System.out.println("Connecting wires for electrical setup.");
        checkConnection();
        System.out.println("Above function 'checkConnection()' ensures safety.");
    }

    static void checkConnection() {
        System.out.println("Checking if wire connections are secure.");
        Trafficsignal.getSignalColor();
        System.out.println("Red light indicates power is being supplied.");
    }

    static void repairWire() {
        System.out.println("Repairing a broken wire.");
       checkConnection();
        System.out.println("Green light confirms repair is complete.");
    }

    static void testWire() {
        System.out.println("Testing wire for voltage.");
        Wallet.checkCash();
        System.out.println("After testing, checking Wallet balance for repairs.");
    }
}

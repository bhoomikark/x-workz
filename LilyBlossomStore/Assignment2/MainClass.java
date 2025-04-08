class Lipstick {
    static void apply() {
        System.out.println("Applying lipstick...");
        remove();
        System.out.println("Remove method is invoked from the same class.");
    }
    static void remove() {
        System.out.println("Removing lipstick...");
        Perfume.sprayPerfume();
    }
    static void checkShade() {
        System.out.println("Checking lipstick shade...");
        listAvailableShades();
    }
    static void listAvailableShades() {
        System.out.println("Available shades: Pink, Nude, Berry.");
        Bracelet.showDesigns();
    }
}

class Perfume {
    static void sprayPerfume() {
        System.out.println("Spraying perfume...");
        buyPerfume();
    }
    static void buyPerfume() {
        System.out.println("Buying a new perfume...");
        Wallet.checkCash();
    }
    static void checkFragrance() {
        System.out.println("Checking perfume fragrance...");
        listAvailableFragrances();
    }
    static void listAvailableFragrances() {
        System.out.println("Available fragrances: Floral, Citrus, Woody.");
        Currency.convertCurrency();
    }
}

class Wallet {
    static void checkCash() {
        System.out.println("Checking cash in wallet...");
        makePayment();
    }
    static void makePayment() {
        System.out.println("Making a payment...");
        Bitcoin.mineBitcoin();
    }
    static void addMoney() {
        System.out.println("Adding money to the wallet...");
        checkCash();
    }
    static void transferMoney() {
        System.out.println("Transferring money...");
        Currency.withdrawCash();
    }
}

class Bitcoin {
    static void mineBitcoin() {
        System.out.println("Mining Bitcoin...");
        checkMarketValue();
    }
    static void checkMarketValue() {
        System.out.println("Checking Bitcoin market value...");
        Gold.checkGoldQuality();
    }
    static void tradeBitcoin() {
        System.out.println("Trading Bitcoin...");
        Wallet.addMoney();
    }
    static void secureWallet() {
        System.out.println("Securing Bitcoin wallet...");
        Currency.depositMoney();
    }
}

class Currency {
    static void convertCurrency() {
        System.out.println("Converting currency...");
        withdrawCash();
    }
    static void withdrawCash() {
        System.out.println("Withdrawing cash from ATM...");
        Gold.sellGold();
    }
    static void depositMoney() {
        System.out.println("Depositing money to bank...");
        Wallet.transferMoney();
    }
    static void checkExchangeRate() {
        System.out.println("Checking exchange rates...");
        Bitcoin.tradeBitcoin();
    }
}

class Bracelet {
    static void wearBracelet() {
        System.out.println("Wearing a bracelet...");
        buyBracelet();
    }
    static void buyBracelet() {
        System.out.println("Buying a new bracelet...");
        Pineapple.eatPineapple();
    }
    static void showDesigns() {
        System.out.println("Showing bracelet designs...");
        checkMaterial();
    }
    static void checkMaterial() {
        System.out.println("Bracelet is made of Gold.");
        Gold.checkGoldQuality();
    }
}

class Gold {
    static void checkGoldQuality() {
        System.out.println("Checking gold purity...");
        sellGold();
    }
    static void sellGold() {
        System.out.println("Selling gold...");
        Pineapple.buyPineapple();
    }
    static void buyGold() {
        System.out.println("Buying gold...");
        checkGoldQuality();
    }
    static void investInGold() {
        System.out.println("Investing in gold...");
        Wire.connectWire();
    }
}

class Pineapple {
    static void eatPineapple() {
        System.out.println("Eating pineapple...");
        buyPineapple();
    }
    static void buyPineapple() {
        System.out.println("Buying a fresh pineapple...");
        Wire.repairWire();
    }
    static void checkRipeness() {
        System.out.println("Checking pineapple ripeness...");
        eatPineapple();
    }
    static void storePineapple() {
        System.out.println("Storing pineapple in fridge...");
        Currency.checkExchangeRate();
    }
}

class Wire {
    static void connectWire() {
        System.out.println("Connecting wires...");
        repairWire();
    }
    static void repairWire() {
        System.out.println("Repairing damaged wire...");
        Trafficsignal.greenLight();
    }
    static void checkVoltage() {
        System.out.println("Checking wire voltage...");
        connectWire();
    }
    static void installWire() {
        System.out.println("Installing electrical wire...");
        Trafficsignal.redLight();
    }
}

class Trafficsignal {
    static void redLight() {
        System.out.println("Stopping at red light...");
        yellowLight();
    }
    static void yellowLight() {
        System.out.println("Slowing down at yellow light...");
        greenLight();
    }
    static void greenLight() {
        System.out.println("Moving at green light...");
        showSignalStatus();
    }
    static void showSignalStatus() {
        System.out.println("Traffic signal is working fine.");
    }
}

class MainClass {
    public static void main(String[] args) {
        // Calling all methods
       Lipstick.apply();  // Internally calls Perfume.sprayPerfume()
        Lipstick.remove(); // Internally calls Perfume.sprayPerfume()
        Lipstick.checkShade(); // Internally calls Bracelet.showDesigns()
        Lipstick.listAvailableShades(); // Internally calls Bracelet.showDesigns()
    }
}

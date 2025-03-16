class Bracelet {
    static void wearBracelet() {
        System.out.println("Wearing a bracelet.");
        adjustSize();
        System.out.println("Above function 'adjustSize()' is used to fit the bracelet.");
    }

    static void adjustSize() {
        System.out.println("Adjusting bracelet size.");
        Gold.checkGoldQuality();
        System.out.println("Gold quality checked before adjusting the bracelet.");
    }

    static void buyBracelet() {
        System.out.println("Buying a new bracelet.");
        Gold.sellGold();
        System.out.println("Bracelet purchased using funds from selling Gold.");
    }

    static void cleanBracelet() {
        System.out.println("Cleaning the bracelet.");
       wearBracelet();
        System.out.println("Gold polished to enhance the bracelet's shine.");
    }
}

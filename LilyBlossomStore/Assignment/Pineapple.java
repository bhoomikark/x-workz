class Pineapple {
    static void eatPineapple() {
        System.out.println("Eating pineapple.");
        cutPineapple();
        System.out.println("Above function 'cutPineapple()' prepares the pineapple.");
    }

    static void cutPineapple() {
        System.out.println("Cutting pineapple into slices.");
        Bracelet.wearBracelet();
        System.out.println("Bracelet worn before cutting the pineapple.");
    }

    static void buyPineapple() {
        System.out.println("Buying pineapple from the market.");
        Currency.withdrawCash();
        System.out.println("Pineapple bought using withdrawn cash.");
    }

    static void juicePineapple() {
        System.out.println("Making pineapple juice.");
        eatPineapple();																
        System.out.println("Juicer purchased using Wallet balance.");
    }
}

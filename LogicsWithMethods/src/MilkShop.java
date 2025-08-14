public class MilkShop {
    void monthlyBill(int litresPerDay, int pricePerLitre, int days) {
        int totalBill = litresPerDay * pricePerLitre * days;
        System.out.println("Total Bill for the Month: Rs " + totalBill);
    }
}
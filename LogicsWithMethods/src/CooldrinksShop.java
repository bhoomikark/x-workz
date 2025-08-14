public class CooldrinksShop {
    void sales(int bottlesPerDay, int pricePerBottle, int days) {
        int totalBottles = bottlesPerDay * days;
        int totalSales = totalBottles * pricePerBottle;
        System.out.println("Total Bottles Sold: " + totalBottles);
        System.out.println("Total Sales: Rs " + totalSales);
    }
}
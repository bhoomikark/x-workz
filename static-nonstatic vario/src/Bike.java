public class Bike {
    static String bike_brand = "Royal Enfield";
    int bike_cost;
    String bike_colour;

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.bike_cost = 200000;
        bike.bike_colour = "Black";

        System.out.println("***********************************************");
        System.out.println("The Bike brand is: " + bike_brand);
        System.out.println("The Bike cost is: " + bike.bike_cost);
        System.out.println("The Bike colour is: " + bike.bike_colour);
        System.out.println("***********************************************");
    }
}

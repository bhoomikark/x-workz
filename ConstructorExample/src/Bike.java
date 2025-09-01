class Bike {
    int bike_cost;
    String bike_brand;
    String bike_colour;

    Bike(int bike_cost, String bike_brand, String bike_colour) {
        this.bike_cost = bike_cost;
        this.bike_brand = bike_brand;
        this.bike_colour = bike_colour;
    }

    public static void main(String[] args) {
        Bike bike = new Bike(150000, "Yamaha", "Blue");
        System.out.println(bike.bike_cost);
        System.out.println(bike.bike_brand);
        System.out.println(bike.bike_colour);
    }
}

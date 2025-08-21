public class Laptop {
    static String laptop_brand = "Dell";
    String laptop_name;
    int laptop_cost;

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.laptop_name = "Dell XPS 15";
        laptop.laptop_cost = 120000;

        System.out.println("***********************************************");
        System.out.println("The Laptop brand is: " + laptop_brand);
        System.out.println("The Laptop name is: " + laptop.laptop_name);
        System.out.println("The Laptop cost is: " + laptop.laptop_cost);
        System.out.println("***********************************************");
    }
}

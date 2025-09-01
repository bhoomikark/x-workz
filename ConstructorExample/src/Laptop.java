class Laptop {
    String laptop_name;
    int laptop_cost;
    String laptop_brand;

    Laptop(String laptop_name, int laptop_cost, String laptop_brand) {
        this.laptop_name = laptop_name;
        this.laptop_cost = laptop_cost;
        this.laptop_brand = laptop_brand;
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Inspiron 15", 55000, "Dell");
        System.out.println(laptop.laptop_name);
        System.out.println(laptop.laptop_cost);
        System.out.println(laptop.laptop_brand);
    }
}

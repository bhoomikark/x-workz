class Perfume {
    static void list_available_shades() {
        System.out.println("The available perfume shades are floral, citrus, musky.");
    }

    static void Spray() {
        System.out.println("Spraying perfume...");
        Lipstickk.Remove(); // Calling from Lipstickk
    }

    static void check_fragrance() {
        System.out.println("Checking fragrance in Perfume");
		Spray();
    }

    static void Display() {
        System.out.println("Displaying perfume collection...");
		list_available_shades();
    }
}

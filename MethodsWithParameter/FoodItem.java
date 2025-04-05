class FoodItem
{
	static void ItemName(String[] Names) {
        System.out.println("List of available food items:");
        for (String name : Names) {
            System.out.println("- " + name);
        }
    }

    static void TotalNo(int total) {
        System.out.println("Total number of food items available: " + total);
    }

    static void Rasmalai(boolean Is_Available) {
        System.out.println("Rasmalai availability: " );
		System.out.println(Is_Available);
    }

    static void cook(String item, int time) {
        System.out.println("Cooking " + item + " for " + time + " minutes.");
    }

    static void store(String Item, float Temp) {
        System.out.println("Storing " + Item + " at " + Temp + "°C.");
    }

    static void serve(String Item, int Quantity, String PlateType) {
        System.out.println("Serving " + Quantity + " portions of " + Item + " in a " + PlateType + ".");
    }

    static void buy(String FoodItem, float price, int Quantity) {
        System.out.println("Buying " + Quantity + " " + FoodItem + "(s) at ₹" + price + " each.");
        System.out.println("Total cost: ₹" + (price * Quantity));
    }
	
}
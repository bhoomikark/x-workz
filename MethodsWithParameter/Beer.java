class Beer
{
	static void type(String[] Names) {
        System.out.println("Types of Beer Available:");
        for (String name : Names) {
            System.out.println("- " + name);
        }
    }

    static void NoOfBeer(int Available) {
        System.out.println("Total number of beers available: " + Available);
    }

    static void BrandUPrefer(String NameofBrand) {
        System.out.println("Preferred beer brand: " + NameofBrand);
    }

    static void pourBeer(int quantity, String GlassType) {
        System.out.println("Pouring " + quantity + "ml of beer into a " + GlassType + ".");
    }

    static void drinkBeer(int sips, boolean isChilled) {
        System.out.println("Enjoying " + sips + " sips of " + (isChilled ? "chilled" : "warm") + " beer.");
    }

    static void brewBeer(String Ingredient, int fermentationDays, double alcoholPercentage) {
        System.out.println("Brewing beer using " + Ingredient + " with " + fermentationDays +
                " days of fermentation, having " + alcoholPercentage + "% alcohol.");
    }

    static void rateBeer(String flavour, int bitternessLevel, double userRating) {
        System.out.println("Beer Flavour: " + flavour);
        System.out.println("Bitterness Level (1-10): " + bitternessLevel);
        System.out.println("User Rating: " + userRating + "/5.0");
    }
}
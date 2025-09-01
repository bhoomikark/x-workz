class Home {
    String home_name;
    int home_cost;
    String home_colour;

    Home(String home_name, int home_cost, String home_colour) {
        this.home_name = home_name;
        this.home_cost = home_cost;
        this.home_colour = home_colour;
    }

    public static void main(String[] args) {
        Home home = new Home("Dream Villa", 7500000, "White");
        System.out.println(home.home_name);
        System.out.println(home.home_cost);
        System.out.println(home.home_colour);
    }
}

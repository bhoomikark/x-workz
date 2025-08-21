public class Home {
    static String home_name = "Villa";
    int home_cost;
    String home_colour;

    public static void main(String[] args) {
        Home home = new Home();
        home.home_cost = 5000000;
        home.home_colour = "White";

        System.out.println("***********************************************");
        System.out.println("The Home name is: " + home_name);
        System.out.println("The Home cost is: " + home.home_cost);
        System.out.println("The Home colour is: " + home.home_colour);
        System.out.println("***********************************************");
    }
}

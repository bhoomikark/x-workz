public class TV {
    static String tv_brand = "Sony";
    int tv_cost;
    String tv_type;

    public static void main(String[] args) {
        TV tv = new TV();
        tv.tv_cost = 60000;
        tv.tv_type = "LED";

        System.out.println("***********************************************");
        System.out.println("The TV brand is: " + tv_brand);
        System.out.println("The TV cost is: " + tv.tv_cost);
        System.out.println("The TV type is: " + tv.tv_type);
        System.out.println("***********************************************");
    }
}

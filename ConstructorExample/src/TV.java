class TV {
    int tv_cost;
    String tv_brand;
    String tv_type;

    TV(int tv_cost, String tv_brand, String tv_type) {
        this.tv_cost = tv_cost;
        this.tv_brand = tv_brand;
        this.tv_type = tv_type;
    }

    public static void main(String[] args) {
        TV tv = new TV(40000, "Sony", "LED");
        System.out.println(tv.tv_cost);
        System.out.println(tv.tv_brand);
        System.out.println(tv.tv_type);
    }
}

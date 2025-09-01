class Mobile {
    int mobile_cost;
    String model_name;
    String mobile_color;

    Mobile(int mobile_cost, String model_name, String mobile_color) {
        this.mobile_cost = mobile_cost;
        this.model_name = model_name;
        this.mobile_color = mobile_color;
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile(20000, "Samsung M10", "Black");
        System.out.println(mobile.mobile_cost);
        System.out.println(mobile.model_name);
        System.out.println(mobile.mobile_color);
    }
}

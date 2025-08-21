public class Mobile {
    static String mobile_modle_name="Samsung S23";
    int mobile_cost;
    String mobile_color;

    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.mobile_color="Blue";
        mobile.mobile_cost=70000;
        System.out.println("***********************************************");
        System.out.println("The Mobile modle name is: "+mobile_modle_name);
        System.out.println("The mobile color is: "+mobile.mobile_color);
        System.out.println("The mobile cost is: "+mobile.mobile_cost);
        System.out.println("***********************************************");
    }
}

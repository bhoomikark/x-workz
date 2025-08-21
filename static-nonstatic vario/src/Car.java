public class Car {
    static String car_model_name = "Toyota Innova";
    int car_cost;
    String car_type;

    public static void main(String[] args) {
        Car car = new Car();
        car.car_cost = 2500000;
        car.car_type = "Diesel";

        System.out.println("***********************************************");
        System.out.println("The Car model name is: " + car_model_name);
        System.out.println("The Car cost is: " + car.car_cost);
        System.out.println("The Car type is: " + car.car_type);
        System.out.println("***********************************************");
    }
}

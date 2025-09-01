class Car {
    int car_cost;
    String car_model_name;
    String car_type;

    Car(int car_cost, String car_model_name, String car_type) {
        this.car_cost = car_cost;
        this.car_model_name = car_model_name;
        this.car_type = car_type;
    }

    public static void main(String[] args) {
        Car car = new Car(500000, "Honda City", "Petrol");
        System.out.println(car.car_cost);
        System.out.println(car.car_model_name);
        System.out.println(car.car_type);
    }
}

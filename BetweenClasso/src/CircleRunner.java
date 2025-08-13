public class CircleRunner {
    public static void main(String[] args) {
        Circle.area_of_circle();
        Circle.area_with_two(5);
        System.out.println("************************");
        double x = Circle.area_with_return();
        System.out.println("Area of Circle is: " + x);
    }
}
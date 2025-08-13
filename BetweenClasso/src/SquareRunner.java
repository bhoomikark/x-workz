public class SquareRunner {
    public static void main(String[] args) {
        Square.area_of_square();
        Square.area_with_two(5);
        System.out.println("************************");
        double x = Square.area_with_return();
        System.out.println("Area of Square is: " + x);
    }
}
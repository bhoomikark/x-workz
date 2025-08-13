public class Trapezoid {
    static void area_of_trapezoid() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes");
        int a = 20, b = 30, h = 10;
        double area = 0.5 * (a + b) * h;
        System.out.println("Area of Trapezoid is: " + area);
        System.out.println("**************************************");
    }

    static void area_with_two(int a, int b, int h) {
        System.out.println("**************************************");
        System.out.println("Method with parameter between classes");
        double result = 0.5 * (a + b) * h;
        System.out.println("Area of Trapezoid is: " + result);
        System.out.println("**************************************");
    }

    static double area_with_return() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes with return type");
        int a = 20, b = 30, h = 10;
        double result = 0.5 * (a + b) * h;
        return result;
    }
}
public class Ellipse {
    static void area_of_ellipse() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes");
        int a = 5, b = 10;
        double area = Math.PI * a * b;
        System.out.println("Area of Ellipse is: " + area);
        System.out.println("**************************************");
    }

    static void area_with_two(int a, int b) {
        System.out.println("**************************************");
        System.out.println("Method with parameter between classes");
        double result = Math.PI * a * b;
        System.out.println("Area of Ellipse is: " + result);
        System.out.println("**************************************");
    }

    static double area_with_return() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes with return type");
        int a = 5, b = 10;
        double result = Math.PI * a * b;
        return result;
    }
}

public class Rectangle {
    static void area_of_rectangle() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes");
        int w = 20;
        int h = 30;
        double area = w * h;
        System.out.println("Area of Rectangle is: " + area);
        System.out.println("**************************************");
    }

    static void area_with_two(int w, int h) {
        System.out.println("**************************************");
        System.out.println("Method with parameter between classes");
        double result = w * h;
        System.out.println("Area of Rectangle is: " + result);
        System.out.println("**************************************");
    }

    static double area_with_return() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes with return type");
        int w = 20;
        int h = 30;
        double result = w * h;
        return result;
    }
}
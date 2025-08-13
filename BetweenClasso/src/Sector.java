public class Sector {
    static void area_of_sector() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes");
        int r = 10;
        double theta = Math.PI / 4; // 45 degrees in radians
        double area = 0.5 * r * r * theta;
        System.out.println("Area of Sector is: " + area);
        System.out.println("**************************************");
    }

    static void area_with_two(int r, double theta) {
        System.out.println("**************************************");
        System.out.println("Method with parameter between classes");
        double result = 0.5 * r * r * theta;
        System.out.println("Area of Sector is: " + result);
        System.out.println("**************************************");
    }

    static double area_with_return() {
        System.out.println("**************************************");
        System.out.println("Static method between the classes with return type");
        int r = 10;
        double theta = Math.PI / 4;
        double result = 0.5 * r * r * theta;
        return result;
    }
}
public class Rectangle {
    static double area_of_rectangle() {
        double width = 10.0;
        double height = 20.0;
        double result=0.5*width*height;
        return result;
    }

    public static void main(String[] args) {
        double result2=area_of_rectangle();
        System.out.println("The area of rectangle is: "+result2);

    }
}


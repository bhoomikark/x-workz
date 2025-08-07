public class Methodhon {
    static void triangle()
    {
        float base=10.0f;
        float height=1.0f;
        double area_of_triangle=0.5*base*height;
        System.out.println(
                "The area of traingle is: "+area_of_triangle
        );
    }
    static void rectangle()
    {
        double width=10.0d;
        double height=5.0d;
        double area_of_rectangle=0.5*width*height;
        System.out.println(
                "The area of rectangle is: "+area_of_rectangle
        );
    }
    static void trapezoid()
    {
        double a=10.0d;
        double h=5.0d;
        double b=20.0d;
        double area_of_trapezoid=0.5*(a+b)*h;
        System.out.println(
                "The area of trapezoid is: "+area_of_trapezoid
        );
    }
    static void ellipse()
    {
        double pi=3.14;
        double a=10.0;
        double b=20.0;
        double area=pi*a*b;
        System.out.println("The area of ellipse is: "+area);
    }
    static void square()
    {

        double a=10.0;

        double area_of_square=a*a;
        System.out.println("The area of square is: "+area_of_square);
    }

    static void parallelogram()
    {

        double base=10.0;
        double height=20.0;
        double area_of_para=base*height;
        System.out.println("The area of parallelogram is: "+area_of_para);
    }
    static void circle()
    {
        double pi=3.14;
        double radius=10.0;

        double area_of_circle=pi*radius*radius;
        System.out.println("The area of circle is: "+area_of_circle);
    }
    static void sector()
    {

        double radius=10.0;
        double teta=20.0;
        double area_of_sector=0.5*radius*radius*teta;
        System.out.println("The area of ellipse is: "+area_of_sector);
    }


    public static void main(String[] args)
   {
triangle();
rectangle();
trapezoid();
ellipse();
square();
parallelogram();
circle();
sector();
   }




}

public class Course {
    static String course_name = "B.Tech";
    String univr_name;
    int exam_cost;

    public static void main(String[] args) {
        Course course = new Course();
        course.univr_name = "VTU";
        course.exam_cost = 1500;

        System.out.println("***********************************************");
        System.out.println("The Course name is: " + course_name);
        System.out.println("The University name is: " + course.univr_name);
        System.out.println("The Exam cost is: " + course.exam_cost);
        System.out.println("***********************************************");
    }
}

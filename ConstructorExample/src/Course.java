class Course {
    String course_name;
    String univ_name;
    int exam_cost;

    Course(String course_name, String univ_name, int exam_cost) {
        this.course_name = course_name;
        this.univ_name = univ_name;
        this.exam_cost = exam_cost;
    }

    public static void main(String[] args) {
        Course course = new Course("B.Tech", "VTU", 1500);
        System.out.println(course.course_name);
        System.out.println(course.univ_name);
        System.out.println(course.exam_cost);
    }
}

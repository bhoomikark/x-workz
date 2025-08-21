public class School {
    static String school_name = "Delhi Public School";
    String school_grade;
    int school_strength;

    public static void main(String[] args) {
        School school = new School();
        school.school_grade = "Grade A";
        school.school_strength = 1200;

        System.out.println("***********************************************");
        System.out.println("The School name is: " + school_name);
        System.out.println("The School grade is: " + school.school_grade);
        System.out.println("The School strength is: " + school.school_strength);
        System.out.println("***********************************************");
    }
}

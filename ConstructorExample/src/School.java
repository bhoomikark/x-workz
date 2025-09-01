class School {
    String school_name;
    String school_grade;
    int school_strength;

    School(String school_name, String school_grade, int school_strength) {
        this.school_name = school_name;
        this.school_grade = school_grade;
        this.school_strength = school_strength;
    }

    public static void main(String[] args) {
        School school = new School("National Public School", "A+", 1200);
        System.out.println(school.school_name);
        System.out.println(school.school_grade);
        System.out.println(school.school_strength);
    }
}

class Employee {
    int emp_id;
    int emp_sal;
    String emp_grade;

    Employee(int emp_id, int emp_sal, String emp_grade) {
        this.emp_id = emp_id;
        this.emp_sal = emp_sal;
        this.emp_grade = emp_grade;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, 50000, "A");
        System.out.println(emp.emp_id);
        System.out.println(emp.emp_sal);
        System.out.println(emp.emp_grade);
    }
}

public class Employee {
    static String emp_id = "E101";
    String emp_sal;
    String emp_grad;

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.emp_sal = "50000";
        emp.emp_grad = "A";

        System.out.println("***********************************************");
        System.out.println("The Employee ID is: " + emp_id);
        System.out.println("The Employee Salary is: " + emp.emp_sal);
        System.out.println("The Employee Grade is: " + emp.emp_grad);
        System.out.println("***********************************************");
    }
}

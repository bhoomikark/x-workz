class VTU {
    public void Results() {
        System.out.println("VTU Results are published online");
    }
}

class ExamPortal {
    static void check(VTU v2) {
        v2.Results();
    }
}

public class StudentCustomer {
    public static void main(String[] args) {
        VTU v1 = new VTU();
        ExamPortal.check(v1);
    }
}

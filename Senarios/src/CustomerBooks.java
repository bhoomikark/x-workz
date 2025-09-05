class Books {
    public void Novel() {
        System.out.println("Fiction and Non-fiction Novels are available");
    }
}

class Amazon {
    static void order(Books b2) {
        b2.Novel();
    }
}

public class CustomerBooks {
    public static void main(String[] args) {
        Books b1 = new Books();
        Amazon.order(b1);
    }
}

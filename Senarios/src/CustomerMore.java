class More {
    public void Groceries() {
        System.out.println("Fresh vegetables and fruits are available");
    }
}

class Store {
    static void buy(More m2) {
        m2.Groceries();
    }
}

public class CustomerMore {
    public static void main(String[] args) {
        More m1 = new More();
        Store.buy(m1);
    }
}

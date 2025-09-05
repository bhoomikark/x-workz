class Miniso {
    public void Accessories() {
        System.out.println("Cute and trendy accessories are available");
    }
}

class Mall {
    static void purchase(Miniso mi2) {
        mi2.Accessories();
    }
}

public class CustomerMiniso {
    public static void main(String[] args) {
        Miniso mi1 = new Miniso();
        Mall.purchase(mi1);
    }
}

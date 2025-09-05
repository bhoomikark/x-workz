class Dress
{
    public void Jeans()
    {
        System.out.println("Wide leg Jeans are available");
    }

}
class Myntra
{
    static void order(Dress d2)
    {
        d2.Jeans();
    }
}

public class Customer {
    public static void main(String[] args) {
        Dress d1=new Dress();
        Myntra.order(d1);

    }
}

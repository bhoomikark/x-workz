public class SectorRunner {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("Sector without parameter:");
        new SectorWoParameter().area();

        System.out.println("Sector with parameter:");
        new SectorWithParameter().area(6.0, 1.5);

        System.out.println("Sector with return type:");
        double result = new SectorWithReturnType().area();
        System.out.println("The area of Sector is: " + result);
    }
}

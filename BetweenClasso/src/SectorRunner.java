public class SectorRunner {
    public static void main(String[] args) {
        Sector.area_of_sector();
        Sector.area_with_two(5, Math.PI / 3);
        System.out.println("************************");
        double x = Sector.area_with_return();
        System.out.println("Area of Sector is: " + x);
    }
}